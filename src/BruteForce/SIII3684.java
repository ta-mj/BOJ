package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIII3684 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        int[] data = new int[2 * T];
        for(int i = 0; i < T; i++){
            data[2 * i] = Integer.parseInt(bufferedReader.readLine());
        }
        for(int a = 0 ; a <= 10000 ; a++){
            for(int b = 0 ; b <= 10000 ; b++){
                int xi = data[0];
                boolean isOkay = true;
                for(int i = 1 ; i < 2 * T ; i++){
                    xi = (a * xi + b) % 10001;
                    if(i % 2 == 0){
                        if(xi != data[i]){
                            isOkay = false;
                            break;
                        }
                    }
                    else{
                        data[i] = xi;
                    }
                }
                if(isOkay){
                    StringBuilder stringBuilder = new StringBuilder();
                    for(int i = 1 ; i < 2 * T ; i += 2){
                        stringBuilder.append(data[i]).append('\n');
                    }
                    System.out.println(stringBuilder);
                    return;
                }
            }
        }
    }
}
