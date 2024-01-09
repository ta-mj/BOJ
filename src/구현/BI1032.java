package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BI1032 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] strings = new String[N];
        for(int i = 0 ; i < N ; i++){
            strings[i] = bufferedReader.readLine();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < strings[0].length() ; i++){
            boolean isSame = true;
            char c = strings[0].charAt(i);
            for(int j = 1 ; j < strings.length ; j++){
                if(!(strings[j].charAt(i) == c)){
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                stringBuilder.append(c);
            }
            else{
                stringBuilder.append('?');
            }
        }
        System.out.println(stringBuilder);
    }
}
