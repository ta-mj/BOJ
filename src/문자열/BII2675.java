package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BII2675 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < t ; i++){
            String[] array = bufferedReader.readLine().split(" ");
            int num = Integer.parseInt(array[0]);
            for(int j = 0 ; j < array[1].length() ; j++){
                for(int k = 0 ; k < num ; k++){
                    stringBuilder.append(array[1].charAt(j));
                }
            }
            stringBuilder.append('\n');
        }
        System.out.print(stringBuilder);
    }

}
