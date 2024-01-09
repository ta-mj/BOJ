package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BIV27918 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int [] win = new int[2];
        win[0] = 0; win[1] = 0;
        for(int i = 0 ; i < n ; i++){
            if(bufferedReader.readLine().equals("D")){
                win[0]++;
            }
            else{
                win[1]++;
            }
            if(Math.abs(win[0] - win[1]) >= 2){
                System.out.println(win[0] + ":" + win[1]);
                return;
            }
        }
        System.out.println(win[0] + ":" + win[1]);
    }
}
