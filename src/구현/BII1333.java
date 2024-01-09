package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BII1333 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        int D = Integer.parseInt(stringTokenizer.nextToken());
        ArrayList<Boolean> arrayList = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < L ; j++){
                arrayList.add(true);
            }
            if(i < N - 1){
                for(int j = 0 ; j < 5 ; j++){
                    arrayList.add(false);
                }
            }
        }
        int result = 0;
        while (result < arrayList.size()) {
            if(arrayList.get(result) == false){
                System.out.println(result);
                return;
            }
            else{
                result += D;
            }
        }
        System.out.println(result);
    }
}
