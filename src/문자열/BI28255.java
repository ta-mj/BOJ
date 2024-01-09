package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BI28255 {
    public static String rev(String str){
        String result = "";
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            result += String.valueOf(str.charAt(i));
        }
        return result;
    }
    public static String tail(String str){
        return str.substring(1,str.length());
    }
    public static boolean isIcecream(String str){
        String s = str.substring(0, (int)Math.ceil(str.length() / 3.0));
        String rev_s = rev(s);
        String tail_s = tail(s);
        String tail_rev_s = tail(rev(s));
        return (str.equals(s + rev_s + s) || str.equals(s + tail_rev_s + s) || str.equals(s + rev_s + tail_s) || str.equals(s + tail_rev_s + tail_s));
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t ; i++){
            if(isIcecream(bufferedReader.readLine())){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
