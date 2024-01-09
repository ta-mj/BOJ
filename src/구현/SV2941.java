package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SV2941 {
    public static void main(String args[]) throws IOException {
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        for(String word : croatia){
            str = str.replaceAll(word,"1");
        }
        System.out.println(str.length());

    }
}
