package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GV9084 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < T ; i++){
            int N = Integer.parseInt(bufferedReader.readLine());
            int[] coin = new int[N];
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0 ; j < N ; j++){
                coin[j] = Integer.parseInt(st.nextToken());
            }
            int M = Integer.parseInt(bufferedReader.readLine());
            int[] dp = new int[M + 1];
            sb.append(dp[M]).append('\n');
        }
    }
}
