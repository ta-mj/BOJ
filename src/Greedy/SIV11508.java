package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SIV11508 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Integer[] arr = new Integer[n];
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for(int i = 2 ; i < n ; i += 3){
            sum -= arr[i];
        }
        System.out.println(sum);
    }
}
