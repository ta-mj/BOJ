package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIV17287 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int max = -1;
        int num = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            switch (c){
                case '(':
                    num += 1;
                    break;
                case '{':
                    num += 2;
                    break;
                case '[':
                    num += 3;
                    break;
                case ')':
                    num -= 1;
                    break;
                case '}':
                    num -= 2;
                    break;
                case ']':
                    num -= 3;
                    break;
                default:
                    max = Math.max(max, num);
            }
        }
        System.out.println(max);
    }
}
