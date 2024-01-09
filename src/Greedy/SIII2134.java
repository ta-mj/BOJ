package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SIII2134 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int[] prev = new int[n];
        int[] next = new int[m];
        int num_item = 0;
        int can_store = 0;
        for(int i = 0 ; i < n ; i++){
            prev[i] = Integer.parseInt(bufferedReader.readLine());
            num_item += prev[i];
        }
        for(int i = 0 ; i < m ; i++){
            next[i] = Integer.parseInt(bufferedReader.readLine());
            can_store += next[i];
        }
        int max_store = num_item > can_store ? can_store : num_item;
        num_item = max_store;
        can_store = max_store;

        long result = 0;
        for(int i = 0 ; num_item > 0 ; i++){
            if(num_item >= prev[i]){
                result += prev[i] * (i + 1); //(i + 1)층의 있는 물건을 옮겨야 하므로
                num_item -= prev[i];
            }
            else{
                result += (num_item) * (i + 1);
                num_item = 0;
            }
        }
        for(int i = 0 ; can_store > 0 ; i++){
            if(can_store >= next[i]){
                result += next[i] * (i + 1); //(i + 1)층의 있는 물건을 옮겨야 하므로
                can_store -= next[i];
            }
            else{
                result += can_store * (i + 1);
                can_store = 0;
            }
        }
        System.out.println(max_store + " " + result);
    }
}
