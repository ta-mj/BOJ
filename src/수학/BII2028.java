package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BII2028 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < t ; i++){
            String str = bufferedReader.readLine();
            String num = Integer.toString((int)Math.pow(Integer.parseInt(str),2));
            if(str.equals(num.substring(num.length() - str.length()))){
                stringBuilder.append("YES");
                stringBuilder.append("\n");
            }
            else{
                stringBuilder.append("NO");
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
