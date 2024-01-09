package HASH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SIV1764 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<>();
        for(int i = 0 ; i < N ; i++){
            hashSet.add(bufferedReader.readLine());
        }
        ArrayList<String> result = new ArrayList<>();
        for(int j = 0 ; j < M ; j++){
            String name = bufferedReader.readLine();
            if(hashSet.contains(name)){
                result.add(name);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(String name : result){
            System.out.println(name);
        }
    }
}
