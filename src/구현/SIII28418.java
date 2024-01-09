package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SIII28418 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a1 = Integer.parseInt(stringTokenizer.nextToken());
        int b1 = Integer.parseInt(stringTokenizer.nextToken());
        int c1 = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int b2 = Integer.parseInt(stringTokenizer.nextToken());
        int c2 = Integer.parseInt(stringTokenizer.nextToken());
        int a,b,c;
        a = (a1 * b2 * (b2  - 1));
        b = 2 * a1 * b2 * c2;
        c = a1 * (c2 * c2) + b1 * c2 + c1 - (c1 * b2 + c2);
        if(a == 0 && b == 0 && c == 0){
            System.out.println("Nice");
        }
        else if(a == 0 && (b != 0 || c != 0)){
            if(b != 0){
                System.out.println("Remember my character");
            }
            else{
                System.out.println("Head on");
            }
        }
        else{
            int result = (b * b) - (4 * a * c);
            if(result > 0){
                System.out.println("Go ahead");
            }
            else if(result == 0){
                System.out.println("Remember my character");
            }
            else{
                System.out.println("Head on");
            }
        }
    }
}
