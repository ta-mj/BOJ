package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BII4564 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        while(true){
            String str = bufferedReader.readLine();
            if(str.equals("0")){
                break;
            }
            else{
                while (str.length() != 1){
                    stringBuilder.append(str + " ");
                    int num = 1;
                    for(int i = 0 ; i < str.length() ; i++){
                        num  *= (str.charAt(i)) - '0';
                    }
                    str = Integer.toString(num);
                }
                stringBuilder.append(str);
                stringBuilder.append('\n');
            }
        }
        System.out.println(stringBuilder);
    }
}
