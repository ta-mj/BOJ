package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BII14487 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int max = -1;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if(max < num){
                max = num;
            }
            sum += num;
        }
        System.out.println(sum - max);
    }
}
