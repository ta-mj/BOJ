package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIV12927 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split("");
        int n = str.length;
        int num_switch = 0;
        for(int i = 1 ; i <= n ; i++){
            if(str[i - 1].equals("Y")){
                str[i - 1] = "N";
                for(int j = 2 * i ; j <= n ; j += i){
                    if(str[j - 1].equals("Y")){
                        str[j - 1] = "N";
                    }
                    else{
                        str[j - 1] = "Y";
                    }
                }
                num_switch++;
            }
        }
        System.out.println(num_switch);
    }
}
