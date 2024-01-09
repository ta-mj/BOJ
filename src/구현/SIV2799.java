package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SIV2799 {
    public static int[] result = new int[5];
    static int N,M;
    static char[][] map;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        map = new char[5*N + 1][5*M + 1];
        StringTokenizer st;
        for(int i = 0 ; i <= 5*N ; i++){
            map[i] = bufferedReader.readLine().toCharArray();
        }
        for(int i = 1; i <= 5 * N ; i += 5){
            for(int j = 1 ; j <= 5 * M ; j += 5){
                int num_star = 0;
                for(int k = 0 ; k < 4 ; k++){
                    if(map[i + k][j] == '*'){
                        num_star ++;
                    }
                }
                result[num_star] ++;
            }
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
