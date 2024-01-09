package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SV1475 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split("");
        int result = 0;
        int[] numCard = new int[9];
        for(int i = 0 ; i < 9 ; i++){
            numCard[i] = 0;
        }
        for(int i = 0 ; i < str.length ; i++){
            int num = Integer.parseInt(str[i]);
            if(num == 9) num = 6;
            if(numCard[num] == 0){
                result++;
                numCard[num]--;
                for(int j = 0  ; j < 9 ; j++){
                    numCard[j]++;
                }
                numCard[6]++;
            }
            else{
                numCard[num]--;
            }
        }
        System.out.println(result);
    }
}
