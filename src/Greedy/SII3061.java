package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SII3061 {
    public static int drawLad(int[] array){
        int result = 0;
        for(int i = 0 ; i < array.length ; i++){
            int index = i;
            for(int j = i ; j < array.length ; j++){
              if(i == array[j]){
                  index = j;
              }
            }
            while(i != array[i]){
                int temp = array[index - 1];
                array[index - 1] = array[index];
                array[index] = temp;
                index --;
                result++;
            }
        }
        return result;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bufferedReader.readLine());
        int[] result = new int[k];
        for(int i = 0 ; i < k ; i++){
            int n = Integer.parseInt(bufferedReader.readLine());
            String[] str = bufferedReader.readLine().split(" ");
            int[] array = new int[n];
            for(int j = 0 ; j < n ; j++){
                array[j] = Integer.parseInt(str[j]) - 1;//배열의 index로 표현하기 위함
            }
            result[i] = drawLad(array);
        }
        for(int i = 0 ; i < k ; i++){
            System.out.println(result[i]);
        }
    }
}
