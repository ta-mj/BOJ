package 구현;

import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BIII13698 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] ways = bufferedReader.readLine().split("");
        int small = 0;
        int big = 3;
        int[][] moves = {{0,1},{0,2},{0,3},{1,2},{1,3},{2,3}};
        int[] cups = {1 , 0, 0, 2};//작은공 : 1, 큰공 : 2
        for(int i = 0 ; i < ways.length ; i++){
            int way = ways[i].charAt(0) - 'A';
            int temp = cups[moves[way][0]];
            cups[moves[way][0]] = cups[moves[way][1]];
            cups[moves[way][1]] = temp;
        }
        for(int i = 0 ; i < 4 ; i++){
            if(cups[i] == 1){
                small = i + 1;
            }
            else if(cups[i] == 2){
                big = i + 1;
            }
        }
        System.out.println(small + "\n" + big);
    }
}
