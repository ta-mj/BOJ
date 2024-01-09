package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SV13119 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int S = Integer.parseInt(stringTokenizer.nextToken());
        int[] height = new int[M];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0 ; i < M ; i++){
            height[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = N ; i > S ; i--){
            for(int j = 0 ; j < M ; j++){
                if(height[j] >= i){
                    stringBuilder.append('#');
                }
                else{
                    stringBuilder.append('.');
                }
            }
            stringBuilder.append('\n');
        }
        for(int i = 0 ; i < M ; i++){
            if(height[i] >= S){
                stringBuilder.append('*');
            }
            else{
                stringBuilder.append('-');
            }
        }
        stringBuilder.append('\n');
        for(int i = S - 1 ; i >= 1 ; i--){
            for(int j = 0 ; j < M ; j++){
                if(height[j] >= i){
                    stringBuilder.append('#');
                }
                else{
                    if((j + 1) % 3 != 0) {
                        stringBuilder.append('.');
                    }
                    else{
                        stringBuilder.append('|');
                    }
                }
            }
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
