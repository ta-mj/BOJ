package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BII24937 {
    public static void main(String args[]) throws IOException {
        String str = "SciComLove";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(str.substring(n%10, 10) + str.substring(0,n%10));
    }
}
