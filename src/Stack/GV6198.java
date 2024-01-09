package Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class GV6198{
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        long result = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ;i < n ; i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            while (!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
            result += stack.size();
            stack.push(num);
        }
        System.out.println(result);
    }
}
