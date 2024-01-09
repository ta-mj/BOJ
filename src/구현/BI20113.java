package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BI20113 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] vote = new int[n + 1];
        int result = 0;
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1 ; i <= n ; i++){
            vote[Integer.parseInt(st.nextToken())] ++;
        }
        int max = Arrays.stream(vote).max().getAsInt();
        int num_max = 0;
        for(int i = 1 ; i <= n ; i++){
            if(vote[i] == max){
                if(num_max == 0){
                    result = i;
                    num_max++;
                }
                else{
                    System.out.println("skipped");
                    return;
                }
            }
        }
        System.out.println(result);
    }
}
