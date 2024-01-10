package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BI18229 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int person = -1;
        int count = Integer.MAX_VALUE;
        for(int i = 1 ; i <= N ; i++){
            int sum = 0;
            st = new StringTokenizer(bufferedReader.readLine());
            for(int j = 1; j <= M ; j++){
                sum += Integer.parseInt(st.nextToken());
                if(sum >= K && j < count){
                    person = i;
                    count = j;
                }
            }
        }
        System.out.println(person + " " + count);
    }
}
