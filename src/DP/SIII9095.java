package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SIII9095 {
    public static void main(String args[]) throws IOException{
        //DP 먼저 계산
        int[] dp = new int[12];
        dp[1] = 1; // 1
        dp[2] = 2; // 2 , 1 + 1
        dp[3] = 4; //3 , 2 + 1, 1 + 2, 1 + 1 + 1
        for(int i = 4 ; i <= 11 ; i++){
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            stringBuilder.append(dp[Integer.parseInt(bufferedReader.readLine())]);
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
