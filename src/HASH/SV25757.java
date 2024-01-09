package HASH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SV25757 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        HashSet<String> hashSet = new HashSet<>();
        int n = Integer.parseInt(str[0]);
        int num_people;
        if(str[1].equals("Y")){
            num_people = 1;
        }
        else if(str[1].equals("F")){
            num_people = 2;
        }
        else{
            num_people = 3;
        }
        for(int i = 0 ; i < n ; i++){
            hashSet.add(bufferedReader.readLine());
        }
        System.out.println(hashSet.size() / num_people);
    }
}
