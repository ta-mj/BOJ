package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SV28064 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] name = new String[N];
        for(int i = 0 ; i < N ; i++){
            name[i] = bufferedReader.readLine();
        }
        int sum = 0;
        for(int i = 0 ; i < N - 1; i++){
            for(int j = i + 1 ; j < N ; j++){
                int len = Math.min(name[i].length() , name[j].length());
                for(int k = 1; k <= len ; k++){
                    if(name[i].substring(name[i].length() - k).equals(name[j].substring(0,k))
                            ||name[i].substring(0,k).equals(name[j].substring(name[j].length() - k))){
                        sum++;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
