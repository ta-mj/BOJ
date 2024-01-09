package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GII9527 {
    public static long cal1Num(long num){
        long i = 1;
        long result = 0;
        while (i <= num){
            result += (num / (i * 2)) * i;
            if(num % (i * 2) - i + 1 > 0){
                result += num % (i * 2) - i + 1;
            }
            i *= 2;
        }
        return result;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.println(cal1Num(b) - cal1Num(a - 1));
    }
}
