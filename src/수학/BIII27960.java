package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BIII27960 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int result = 0;
        int numTarget = 512;
        while (numTarget > 0){
            if((a >= numTarget && b < numTarget) || (a < numTarget && b >= numTarget)){
                result += numTarget;
            }
            a %= numTarget;
            b %= numTarget;
            numTarget /= 2;
        }
        System.out.println(result);
    }
}
