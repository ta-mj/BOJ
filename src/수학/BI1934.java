package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BI1934 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n1,n2;
        for(int i = 0 ; i < t ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            int num = n1 * n2 / gcd(n1,n2);
            sb.append(num);
            sb.append('\n');
        }
        System.out.println(sb);
    }
    public static int gcd(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
