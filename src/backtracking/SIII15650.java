package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SIII15650 {
    static int N,M;
    static StringBuilder stringBuilder;
    public static void dfs(int i,int[] arr, int numSelect){
        if(numSelect == M){
            for(int j = 0 ; j < M ; j++){
                stringBuilder.append(arr[j] + " ");
            }
            stringBuilder.append('\n');
        }
        else{
            if((N - i) + numSelect >= M){
                int[] arr_ = arr;
                arr_[numSelect] = i + 1;
                dfs(i + 1, arr_, numSelect + 1);
                dfs(i + 1, arr,numSelect);
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        if(N == M){
            for(int i = 1 ; i <= N ; i++){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        int[] arr = new int[M];
        stringBuilder = new StringBuilder();
        dfs(0, arr,0);
        System.out.println(stringBuilder);
    }
}
