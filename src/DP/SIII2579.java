package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIII2579 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] stair = new int[n + 1];
        for(int i = 1 ; i <= n ; i++){
            stair[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stair[i - 1]) + stair[i];
        }
        System.out.println(dp[n]);
    }
}
