package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class GV7569 {
    static int M,N,H;
    static int[][][] tomato;
    static int[] dh = {-1,1,0,0,0,0};
    static int[] dn = {0,0,-1,1,0,0};
    static int[] dm = {0,0,0,0,-1,1};
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        M = Integer.parseInt(stringTokenizer.nextToken());
        N = Integer.parseInt(stringTokenizer.nextToken());
        H = Integer.parseInt(stringTokenizer.nextToken());
        tomato = new int[H + 1][N + 1][M + 1];
        Queue<Integer[]> queue = new LinkedList<>();
        int numNotYet = 0;
        for(int i = 1 ; i <= H ; i++){
            for(int j = 1 ; j <= N ; j++){
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                for(int k = 1 ; k <= M ; k++){
                    tomato[i][j][k] = Integer.parseInt(stringTokenizer.nextToken());
                    if(tomato[i][j][k] == 1){
                        queue.offer(new Integer[]{i,j,k,0});//마지막 요소는 일수
                    }
                    else if(tomato[i][j][k] == 0){
                        numNotYet++;
                    }
                }
            }
        }
        int result = 0;
        while (!(numNotYet == 0) && !queue.isEmpty()){
            Integer[] info = queue.poll();
            int count = info[3];
            for(int i = 0 ; i < 6 ; i++){
                int h = info[0] + dh[i];
                int n = info[1] + dn[i];
                int m = info[2] + dm[i];
                if(1 <= h && h <= H && 1 <= n && n <= N && 1 <= m &&  m <= M
                        && tomato[h][n][m] == 0){
                    tomato[h][n][m] = 1;
                    numNotYet--;
                    queue.offer(new Integer[]{h,n,m, count + 1});
                    if(result < count + 1){
                        result = count + 1;
                    }
                }
            }
        }
        if(numNotYet != 0){
            System.out.println(-1);
        }
        else {
            System.out.println(result);
        }
    }
}
