package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SV2238 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        int u = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        String[] who = new String[n];
        int[] how_much = new int[n];
        int[] price = new int[u + 1];
        for(int i = 0 ; i <= u ; i++){
            price[i] = 0;
        }
        for(int i = 0 ; i < n ; i++){
            str = bufferedReader.readLine().split(" ");
            who[i] = str[0];
            how_much[i] = Integer.parseInt(str[1]);
            price[how_much[i]]++;
        }
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <= u ; i++){
            if(price[i] != 0 && price[i] < min){
                min = price[i];
                index = i;
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(how_much[i] == index){
                System.out.println(who[i] + " " + how_much[i]);
                return;
            }
        }
    }
}
