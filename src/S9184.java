import java.util.Scanner;
public class S9184 {
    public static int w_DP(int a, int b, int c){
        int result = 0;
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        while (!(a == -1 && b ==-1 && c == -1)){
            System.out.println("w(" + a + "," + b + "," + c + ")" + " = " + w_DP(a,b,c));
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
    }
}
