package DP;
//I, II, III, IV, V, VI, VII, VIII, IX, X
import java.util.ArrayList;
import java.util.Scanner;

public class GV13398 {
    public static int solution(int n, int[] array){
        int[] result = new int[n];
        result[0] = array[0];
        int max = result[0];
        for(int i = 1; i < n ; i++){
            result[i] = Math.max(result[i - 1] + array[i], array[i]);
            max = Math.max(max,result[i]);
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(solution(n, array));
    }
}
