package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BIV15726 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        double[] num = new double[3];
        for(int i = 0 ; i < 3; i++){
            num[i] = Double.parseDouble(stringTokenizer.nextToken());
        }
        System.out.println(Math.max((int)((num[0] * num[1]) / num[2]), (int)((num[0] / num[1]) * num[2])));
    }
}
