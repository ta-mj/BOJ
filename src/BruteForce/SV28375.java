package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SV28375 {
    static int[] month = {0,1,2,3,4,5,6,7,8,9,10,11,12};
    static int[] dayOfMonth = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    public static int calDay(int[] av){
        int result = 0;
        //1~9월
        for(int i = 1 ; i <= 9 ; i++){
            if(av[i] == 0){
                for(int j = 1 ; j <= 9; j++){
                    if(av[j] == 0){
                        result++;
                    }
                }
                for(int j = 10 ; j <= dayOfMonth[i] ; j++){
                    if(av[j/10] == 0 && av[j % 10] == 0){
                        result++;
                    }
                }
            }
        }
        //10,11,12월
        for(int i = 0 ; i <= 2; i++){
            if(av[i] == 0 && av[1] == 0){
                for(int j = 1 ; j <= 9; j++){
                    if(av[j] == 0){
                        result++;
                    }
                }
                for(int j = 10 ; j <= dayOfMonth[10 + i] ; j++){
                    if(av[j/10] == 0 && av[j % 10] == 0){
                        result++;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        int[] av = new int[10];
        for(int i = 0 ; i < n ; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0 ; j < 10 ; j++){
                av[j] = Integer.parseInt(stringTokenizer.nextToken());
            }
            stringBuilder.append(calDay(av));
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
