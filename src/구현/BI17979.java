package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BI17979 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int index = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("char", 2);
        hashMap.put("int", 8);
        hashMap.put("long_long",16);
        for(int i = 0 ; i < n ; i++){
            String type = st.nextToken();
            long num = Long.parseLong(str.substring(index, index + hashMap.get(type)), 16);
            index += hashMap.get(type);
            sb.append(num + " ");
        }
        System.out.println(sb);
    }
}
