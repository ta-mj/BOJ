package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SIV2217 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] rope = new int[n];
        for(int i = 0 ; i < n ; i++){
            rope[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(rope);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(max, rope[i] * (n - i));
        }
        System.out.println(max);
    }
}
