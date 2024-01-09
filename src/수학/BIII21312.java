package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BIII21312 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int[] drink = new int[3];
        boolean isAllEven = true;
        int result1 = 1, result2 = 1;
        for(int i = 0 ; i < 3 ; i++){
            drink[i] = Integer.parseInt(st.nextToken());
            result1 *= drink[i];
            if(drink[i] % 2 == 1){
                isAllEven = false;
                result2 *= drink[i];
            }
        }
        System.out.println(isAllEven ? result1 : result2);
    }
}
