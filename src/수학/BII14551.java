package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BII14551 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        BigInteger sum = BigInteger.valueOf(1);
        for(int i = 0 ; i < N ; i++){
            BigInteger num = BigInteger.valueOf(Integer.parseInt(bufferedReader.readLine()));
            if(num.intValue() != 0){
                sum = sum.multiply(num);
            }
        }
        BigInteger m = BigInteger.valueOf(M);
        sum = sum.mod(m);
        System.out.println(sum);
    }
}
