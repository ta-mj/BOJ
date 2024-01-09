import java.util.Scanner;
public class B24416 {
    public static int result1;
    public static int result2;
    public static int fibRecursion(int n){
        if(n == 1 || n == 2){
            result1++;
            return 1;
        }
        else{
            return fibRecursion(n - 1) + fibRecursion(n - 2);
        }
    }
    public static int fibDP(int n){
        int[] fib = new int[n+1];
        fib[1] = 1;
        fib[2] = 1;
        for(int i = 3 ; i <= n ; i++){
            fib[i] = fib[i-1] + fib[i - 2];
            result2++;
        }
        return fib[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        result1 = 0;
        result2 = 0;
        fibRecursion(n);
        fibDP(n);
        System.out.println(result1 + " " + result2);
    }
}
