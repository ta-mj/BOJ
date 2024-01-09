package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SV15702 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] score = new int[N];
        st = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0 ; i < N ; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        int numMax = Integer.MAX_VALUE, scoreMax = -1;
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            int numNow = Integer.parseInt(st.nextToken());
            int scoreNow = 0;
            for(int j = 0 ; j < N ; j++){
                if(st.nextToken().equals("O")){
                    scoreNow += score[j];                }
            }
            if(scoreNow > scoreMax){
                numMax = numNow;
                scoreMax = scoreNow;
            }
            else if(scoreNow == scoreMax && numMax > numNow){
                numMax = numNow;
            }
        }
        System.out.println(numMax + " " + scoreMax);
    }
}
