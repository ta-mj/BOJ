package backtracking;
import java.util.Scanner;
public class SIII15649 {
    public static void printArray(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    public static void caluclate(int[] array, int max){
        boolean is_available;
        while(array[0] <= max){
            is_available = true;
            for(int i = 1 ; i < array.length ; i++){
                for(int j = 0 ; j < i ; j++){
                    if(array[j] == array[i]){
                        array[i] ++;
                        is_available = false;
                        break;
                    }
                }
                if(array[i] > max){
                    is_available = false;
                    array[i - 1]++;
                    array[i] = 1;
                }
            }
            if(is_available){
                printArray(array);
                array[array.length - 1] ++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0 ; i < length ; i++){
            array[i] = i + 1;
        }
        caluclate(array, max);
    }
}
