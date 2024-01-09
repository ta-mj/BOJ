package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIV14468 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int[] pos1 = new int[26];
        int[] pos2 = new int[26];
        for(int i = 0 ; i < 52 ; i++){
            int index = str.charAt(i) - 'A';
            if(pos1[index] == 0){
                pos1[index] = i + 1;
            }
            else{
                pos2[index] = i + 1;
            }
        }
        int count = 0;
        for(int i = 0 ; i < 26 ; i++){
            for(int j = 0 ; j < 26 ; j++){
                if(pos1[i] < pos1[j] && pos1[j] < pos2[i] && pos2[i] < pos2[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
