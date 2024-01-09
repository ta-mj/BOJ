package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BIII2566 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int r = -1, c = -1;
        for(int i = 0 ; i < 9 ; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0 ; j < 9 ; j++){
                int num = Integer.parseInt(stringTokenizer.nextToken());
                if(num > max){
                    max = num;
                    r = i; c = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(r + 1 + " " + (c + 1));
    }
}
