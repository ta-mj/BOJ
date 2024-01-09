package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SV1531 {
    public static void main(String args[]) throws IOException{
        int[][] numPaper = new int[100 + 1][100 + 1];
        boolean[][] isHidden = new boolean[100 + 1][100 + 1];
        int numHidden = 0;
        for(int i = 1 ; i <= 100 ; i++){
            for(int j = 1 ; j <= 100 ; j++){
                numPaper[i][j] = 0;
                isHidden[i][j] = false;
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x1,y1,x2,y2;
        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            for(int j = y1 ; j <= y2 ; j++){
                for(int k = x1 ; k <= x2 ; k++){
                    numPaper[j][k]++;
                    if(!isHidden[j][k]){
                        if(numPaper[j][k] >  m){
                            isHidden[j][k] = true;
                            numHidden ++;
                        }
                    }
                }
            }
        }
        System.out.println(numHidden);
    }
}
