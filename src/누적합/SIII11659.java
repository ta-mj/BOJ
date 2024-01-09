package 누적합;

import java.io.*;
import java.util.StringTokenizer;

public class SIII11659 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] sum = new int[N + 1];
        sum[0] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i<= N ; i++){
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append((sum[end] - sum[start - 1])).append('\n');
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
