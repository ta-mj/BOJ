package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SI1629 {
    public static long c;
    public static long mod(long a,long b){
        if(b == 1){
            return a % c;
        }
        long temp = mod(a,b / 2);
        if(b % 2 == 1){
            return (temp * temp % c) * a % c;
        }
        return temp * temp % c;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        System.out.println(mod(a,b));
    }
}
