package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SV11723 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();
        int mask = 0;
        for(int i = 0 ; i < M ; i++){
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            String oper = st.nextToken();
            int num;
            switch (oper){
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    mask |= (1 << num - 1);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    mask = mask & ~(1 << (num - 1));
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    sb.append((mask & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    mask ^= (1 << (num - 1));
                    break;
                case "all":
                    mask |= (~0);
                    break;
                case "empty":
                    mask = 0;
                    break;
            }
        }
        System.out.println(sb);
    }
}
