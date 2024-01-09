package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SV3135 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int n = Integer.parseInt(bufferedReader.readLine());
        int min_diff = Math.abs(a - b);
        for(int i = 0 ; i < n ; i++){
            min_diff = Integer.min(min_diff, Math.abs(b - Integer.parseInt(bufferedReader.readLine())));
        }
        if(min_diff == Math.abs(a - b)){
            System.out.println(min_diff);
        }
        else {
            System.out.println(min_diff + 1);
        }
    }
}
