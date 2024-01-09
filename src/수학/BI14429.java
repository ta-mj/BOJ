package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BI14429 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int num = -1;
        int len = Integer.MAX_VALUE;
        StringTokenizer st;
        for(int i = 1 ; i <= N ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            double j = Double.parseDouble(st.nextToken());
            double m = Double.parseDouble(st.nextToken());
            int lenNow = (int)Math.ceil((j - 1) / (m + 1)) * 2;
            if(lenNow < len){
                num = i;
                len = lenNow;
            }
        }
        System.out.println(num + " " + len);
    }
}
