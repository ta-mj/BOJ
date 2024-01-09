package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BIII10953 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            String[] str = bufferedReader.readLine().split(",");
            stringBuilder.append(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
