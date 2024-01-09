package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BII13877 {
    public static int octal(String num){
        int digit = 1;
        int result = 0;
        for(int i = num.length() - 1 ; i >= 0; i--){
            if(num.charAt(i) - '0' >= 8){
                return 0;
            }
            result += (num.charAt(i) - '0') * digit;
            digit *= 8;
        }
        return result;
    }
    public static int hex(String num){
        int digit = 1;
        int result = 0;
        for(int i = num.length() - 1 ; i >= 0 ; i--){
            result += (num.charAt(i) - '0') * digit;
            digit *= 16;
        }
        return result;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1 ; i <= n ; i++){
            String num = bufferedReader.readLine().split(" ")[1];
            stringBuilder.append(i + " ");
            stringBuilder.append(octal(num) + " ");
            stringBuilder.append(Integer.parseInt(num) + " ");
            stringBuilder.append(hex(num) + " ");
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }

}
