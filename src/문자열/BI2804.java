package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BI2804 {
    public static void makeCrossWord(String a, String b, int r, int c){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < b.length() ; i++){
            for(int j = 0 ; j < a.length() ; j++){
                if(i == c){
                    stringBuilder.append(a);
                    break;
                }
                else if(j == r){
                    stringBuilder.append(b.charAt(i));
                }
                else{
                    stringBuilder.append('.');
                }
            }
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String a = stringTokenizer.nextToken();
        String b = stringTokenizer.nextToken();
        for(int i = 0; i < a.length(); i++){
            for(int j = 0 ; j < b.length() ; j++){
                if(a.charAt(i) == b.charAt(j)){
                    makeCrossWord(a,b,i,j);
                    return;
                }
            }
        }
    }
}
