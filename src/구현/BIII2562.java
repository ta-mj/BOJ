package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BIII2562 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 1 ; i <= 9 ;i++){
            int n = Integer.parseInt(bufferedReader.readLine());
            if(max < n){
                max = n;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
