package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SIII21967 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0 ; i < n ; i++){
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int result = 1;
        int left = 0; int right = 0;
        int max = array[0]; int min = array[0];
        while(right < n) {
            max = Math.max(max, array[right]);
            min = Math.min(min, array[right]);
            if(max - min >= 3){
                result = Math.max(result, right - left);
                while((array[left] == min || array[left] == right) && left < right){
                    left++;
                }
                max = array[left];
                min = array[left];
            }
            right++;
        }
        result = Math.max(result , right - left);
        System.out.println(result);
    }
}
