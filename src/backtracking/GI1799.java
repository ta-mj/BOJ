package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GI1799 {
    static int N;
    static int[][] canPut;
    static int[][] status;
    static int canPutNumOdd = 0, canPutNumEven = 0;
    static int numBishopOdd = 0,numBishopEven = 0;
    public static boolean isAvailable(int r, int c){
        for(int i = 0 ; i < r ; i++){
            //왼쪽
            if(c - (r - i) >= 0 && status[i][c - (r - i)] == 1){
                return false;
            }
            //오른쪽
            if(c + (r - i) <= N - 1 && status[i][c + (r - i)] == 1){
                return false;
            }
        }
        return true;
    }
    public static void dfsEven(int r, int c, int count, int remain){
        if(r == N - 1 &&  c == N - 1){
            if(canPut[r][c] == 1 && isAvailable(r,c)){
                status[r][c] = 1;
                numBishopEven = Math.max(numBishopEven, count + 1);
            }
            else{
                status[r][c] = 0;
                numBishopEven = Math.max(numBishopEven, count);
            }
        }
        else{
            if(count + remain > numBishopEven){
                int r_,c_;
                if(r % 2 == 0 && c == N - 1){
                    r_ = r + 1;
                    c_ = 0;
                }
                else if(r % 2 == 1 && c == N - 2){
                    r_ = r + 1;
                    c_ = 1;
                }
                else{
                    r_ = r;
                    c_ = c + 2;
                }
                if(canPut[r][c] == 1){
                    if(isAvailable(r,c)){
                        status[r][c] = 1;
                        dfsEven(r_, c_, count + 1, remain - 1);
                        status[r][c] = 0;
                        dfsEven(r_, c_, count , remain - 1);
                    }
                    else{
                        status[r][c] = 0;
                        dfsEven(r_, c_, count , remain - 1);
                    }
                }
                else{
                    status[r][c] = 0;
                    dfsEven(r_,c_,count,remain);
                }
            }
        }
    }
    public static void dfsOdd(int r, int c, int count, int remain){
        if(r == N - 1 &&  c == N - 2){
            if(canPut[r][c] == 1 && isAvailable(r,c)){
                status[r][c] = 1;
                numBishopOdd = Math.max(numBishopOdd, count + 1);
            }
            else{
                status[r][c] = 0;
                numBishopOdd = Math.max(numBishopOdd, count);
            }
        }
        else{
            if(count + remain > numBishopOdd){
                int r_,c_;
                if(c == N - 2){
                    r_ = r + 1;
                    c_ = 1;
                }
                else{
                    r_ = r;
                    c_ = c + 2;
                }
                if(canPut[r][c] == 1){
                    if(isAvailable(r,c)){
                        status[r][c] = 1;
                        dfsOdd(r_, c_, count + 1, remain - 1);
                        status[r][c] = 0;
                        dfsOdd(r_, c_, count , remain - 1);
                    }
                    else{
                        status[r][c] = 0;
                        dfsOdd(r_, c_, count , remain - 1);
                    }
                }
                else{
                    status[r][c] = 0;
                    dfsOdd(r_,c_,count,remain);
                }
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        canPut = new int[N][N];
        status = new int[N][N];
        for(int i = 0 ; i < N ; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0 ; j < N ; j++){
                canPut[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                status[i][j] = 0;
                if(canPut[i][j] == 1){
                    if((i + j) % 2 == 0){
                        canPutNumEven++;
                    }
                    else{
                        canPutNumOdd++;
                    }
                }
            }
        }
        dfsEven(0,0,0,canPutNumEven);
        dfsOdd(0,1,0, canPutNumOdd);
        System.out.println(numBishopEven + numBishopOdd);
    }
}
