package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BI5533 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] card = new int[N][3];
        int[][] count = new int[100 + 1][3];
        int[] result = new int[N];
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0 ; j < 3; j++){
                card[i][j] = Integer.parseInt(st.nextToken());
                count[card[i][j]][j]++;
            }
        }
        for(int i = 0 ; i < N ; i++){
            for(int j  = 0 ; j < 3 ; j++){
                if(count[card[i][j]][j] == 1){
                    result[i] += card[i][j];
                }
            }
            System.out.println(result[i]);
        }
    }
}
