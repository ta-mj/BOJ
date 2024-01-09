package HASH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SIV1620 {
    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;

        }catch(NumberFormatException e){
            return false;
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer,String> numToName = new HashMap<>();
        HashMap<String,Integer> nameToNum = new HashMap<>();
        for(int i = 1; i <= N ; i++){
            String name = bufferedReader.readLine();
            numToName.put(i,name);
            nameToNum.put(name,i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < M ; i++){
            String question = bufferedReader.readLine();
            if(isNumeric(question)){
                sb.append(numToName.get(Integer.parseInt(question))).append('\n');
            }else{
                sb.append(nameToNum.get(question)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
