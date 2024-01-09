package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GV1107 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        if(N == 100){
            System.out.println(0);
            return;
        }
        int M = Integer.parseInt(bufferedReader.readLine());
        boolean[] isAvailable = new boolean[10];
        for(int i = 0 ; i < 10 ; i++){
            isAvailable[i] = true;
        }
        StringTokenizer st;
        if(M != 0) {
            st = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < M; i++) {
                isAvailable[Integer.parseInt(st.nextToken())] = false;
            }
        }
        int result = Math.abs(N - 100);
        for(int i = 0 ; i <= 999999 ; i++){
            String str = Integer.toString(i);
            boolean canMake = true;
            for(int j = 0 ; j < str.length() ; j++){
                if(!isAvailable[str.charAt(j) - '0']){
                    canMake = false;
                    break;
                }
            }
            if(canMake){
                result = Math.min(result, str.length() + Math.abs(N - i));
            }
        }
        System.out.println(result);
    }
}
