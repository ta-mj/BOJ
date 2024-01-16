package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BI7513 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= T ; i++){
            sb.append("Scenario #").append(i).append(":\n");
            int M = Integer.parseInt(br.readLine());
            String[] word = new String[M];
            for(int j = 0 ; j < M ; j++){
                word[j] = br.readLine();
            }
            int N = Integer.parseInt(br.readLine());
            for(int j = 0 ; j < N ; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int K = Integer.parseInt(st.nextToken());
                String result = "";
                for(int k = 0 ; k < K ; k++){
                    result += word[Integer.parseInt(st.nextToken())];
                }
                sb.append(result).append('\n');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
