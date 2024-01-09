package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SIII15651 {
    static int N,M;
    static StringBuilder stringBuilder;
    public static void dfs(int[] arr, int numSelect){
        if(numSelect >= M){
            for(int i = 0 ; i < M ; i++){
                stringBuilder.append(arr[i] + " ");
            }
            stringBuilder.append('\n');
        }
        else{
            for(int i = 1 ; i <= N ; i++){
                arr[numSelect] = i;
                dfs(arr, numSelect + 1);
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[M];
        stringBuilder = new StringBuilder();
        dfs(arr,0);
        System.out.println(stringBuilder);
    }
}
