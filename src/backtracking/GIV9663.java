package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GIV9663 {
    static int N;
    static int count = 0;
    static int[] chess;
    public static void dfs(int i){
        if(i == 0){
            for(int j = 0 ; j < N ; j++){
                chess[0] = j;
                dfs(i + 1);
            }
        }
        else{
            //다음 줄에 놓을 체스말의 위치
            for(int j = 0 ; j < N ; j++){
                boolean isValid = true;
                for(int c = 0 ; c < i ; c++){
                    //같은 column에 놓았을때
                    if(chess[c] == j){
                        isValid = false;
                        break;
                    }
                    //대각선
                    else if(Math.abs(c - i) == Math.abs(chess[c] - j)){
                        isValid = false;
                        break;
                    }
                }
                if(isValid){
                    if(i == N - 1){
                        count++;
                    }else {
                        chess[i] = j;
                        dfs(i + 1);
                    }
                }
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        if(N == 1){
            System.out.println(1);
            return;
        }
        chess = new int[N];
        for(int i = 0 ; i < N ; i++){
            chess[i] = -1;
        }
        dfs(0);
        System.out.println(count);
    }
}
