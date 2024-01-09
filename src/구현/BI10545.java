package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BI10545 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"");
        map1.put(2,"abc");
        map1.put(3,"def");
        map1.put(4,"ghi");
        map1.put(5,"jkl");
        map1.put(6,"mno");
        map1.put(7,"pqrs");
        map1.put(8,"tuv");
        map1.put(9,"wxyz");
        HashMap<Character,String> map2 = new HashMap<>();
        for(int i = 1 ; i <= 9 ; i++){
            int num = Integer.parseInt(st.nextToken());
            String content = map1.get(num);
            for(int j = 0 ; j < content.length() ; j++){
                map2.put(content.charAt(j),Integer.toString(i).repeat(j + 1));
            }
        }
        String str = bufferedReader.readLine();
        char prev = '.';
        String result = "";
        for(int i = 0 ; i < str.length() ; i++){
            if(prev == map2.get(str.charAt(i)).charAt(0)){
                result += '#';
            }
            result += map2.get(str.charAt(i));
            prev = map2.get(str.charAt(i)).charAt(0);
        }
        System.out.println(result);
    }
}
