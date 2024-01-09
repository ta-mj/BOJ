package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SIV11047 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int[] coin = new int[n];
        int k = Integer.parseInt(str[1]);
        int result = 0;
        for(int i = 0 ; i < n ;i++){
            coin[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int index = n-1;
        while(k != 0){
            if(k < coin[index]){
                index--;
            }
            else{
                result += k / coin[index];
                k -= (k / coin[index]) * coin[index];
                index--;
            }
        }
        System.out.println(result);
    }
}
