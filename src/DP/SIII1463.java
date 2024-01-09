package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIII1463 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        if(n == 1){
            System.out.println(0);
            return;
        }
        else if(n <= 3) {
            System.out.println(1);
            return;
        }
        int[] arr = new int[n + 1];
        arr[1] = 0;
        for(int i = 2; i <= n ; i++){
            int div = Integer.MAX_VALUE;
            if(i % 3 == 0 && i % 2 == 0){
                div = Math.min(arr[i/3],arr[i/2]);
            }
            else if(i % 3 == 0){
                div = arr[i/3];
            }
            else if(i % 2 == 0){
                div= arr[i/2];
            }
            arr[i] = Math.min(div,arr[i - 1]) + 1;
        }
        System.out.println(arr[n]);
    }
}
