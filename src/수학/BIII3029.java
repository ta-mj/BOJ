package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BIII3029 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bufferedReader.readLine();
        String str2 = bufferedReader.readLine();
        String[] strSplit1 = bufferedReader.readLine().split(":");
        String[] strSplit2 = bufferedReader.readLine().split(":");
        int[] target = new int[3];
        for(int i = 0 ; i < 3 ; i++){
            target[i] = Integer.parseInt(strSplit2[i]) - Integer.parseInt(strSplit1[i]);
        }
        if(str1.equals(str2)){
            System.out.println("24:00:00");
        }
        else {
            if (target[2] < 0) {
                target[2] += 60;
                target[1]--;
            }
            if (target[1] < 0) {
                target[1] += 60;
                target[0]--;
            }
            if (target[0] < 0) {
                target[0] += 24;
            }
            System.out.format("%02d:%02d:%02d", target[0], target[1], target[2]);
        }
    }
}
