package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BII10812 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N + 1];
        for(int i = 1 ; i <= N ; i++){
            basket[i] = i;
        }
        int[] temp = new int[N + 1];
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            int begin = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int mid = Integer.parseInt(st.nextToken());
            for(int j = begin ; j <= end ; j++){
                if(mid > end){
                    mid = begin;
                }
                temp[j] = basket[mid];
                mid++;
            }
            for(int j = begin ; j <= end ; j++){
                basket[j] = temp[j];
            }
        }
        for(int i = 1; i <= N ; i++){
            System.out.print(basket[i] + " ");
        }
    }
}
