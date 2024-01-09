package BruteForce;
import java.io.*;
public class GIII16637 {
    static char[] data;
    static int n;
    static int result;
    public static int calOper(int num1, int num2, char oper){
        switch (oper)
        {
            case '*':
                return num1 * num2;
            case '+':
                return num1 + num2;
            default: // case '-'
                return num1 - num2;
        }
    }
    public static void calMax(int index, int sum){
        if(index >= n){
            result = Math.max(result,sum);
            return;
        }
        else{
            //괄호 안치는 경우
            calMax(index + 2, calOper(sum, data[index] - '0', data[index-1]));
            //오른쪽에 괄호를 치는 경우
            if(index + 2 < n){
                calMax(index + 4, calOper(sum, calOper(data[index] - '0'
                        , data[index + 2] - '0', data[index + 1]), data[index - 1]));
            }
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        data = bufferedReader.readLine().toCharArray();
        result = Integer.MIN_VALUE;
        calMax(2, data[0] - '0');
        System.out.println(result);
    }
}
