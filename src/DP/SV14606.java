package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SV14606 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        if(n == 1){
            System.out.println(0);
            return;
        }
        else if(n == 2){
            System.out.println(1);
            return;
        }
        int[] enjoy = new int[n + 1];
        enjoy[1] = 0;
        enjoy[2] = 1;
        for(int i = 3; i <= n ; i++){
            enjoy[i] = Integer.MIN_VALUE;
            for(int j = 1 ; j <= i / 2 ; j++){
                enjoy[i] = Math.max(enjoy[i], j * (i - j) + enjoy[j] + enjoy[i - j]);
            }
        }
        System.out.println(enjoy[n]);
    }
}
