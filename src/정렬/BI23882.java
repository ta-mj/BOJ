package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BI23882 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int numChange = 0;
        for(int i = 0 ; i < N ; i++){
            if(numChange == K){
                break;
            }
            int index = -1;
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < N - i ; j++){
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            if(index != N - 1 - i){
                numChange++;
                int temp = arr[N - 1 - i];
                arr[N - 1 - i] = arr[index];
                arr[index] = temp;
            }
        }
        if(numChange < K){
            System.out.println(-1);
        }
        else{
            for(int i = 0 ; i < N ; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
