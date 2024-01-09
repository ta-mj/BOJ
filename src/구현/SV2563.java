package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SV2563 {
    static boolean[][] paper;
    static int n;
    static String str;
    static int x,y;
    static int count;

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        count = 0;
        paper = new boolean[100][100];
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 100 ; j++){
                paper[i][j] = false;
            }
        }
        for(int i = 0 ; i < n ; i++){
            str = bufferedReader.readLine();
            x = Integer.parseInt(str.split(" ")[0]) - 1;
            y = Integer.parseInt(str.split(" ")[1]) - 1;
            for(int j = 0 ; j < 10 ; j++){
                if(j + x >= 100) break;
                for(int k = 0 ; k < 10 ; k++){
                    if(k + y >= 100) break;
                    if(!paper[j + x][k + y]){
                        paper[j + x][k + y] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
