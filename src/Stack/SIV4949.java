package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SIV4949 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringBuilder sb = new StringBuilder();
        while (!str.equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            for(int i = 0 ; i < str.length() ; i++){
                char c = str.charAt(i);
                if(c == '(' || c == '['){
                    stack.push(c);
                }
                else if(c == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        isBalanced = false;
                        break;
                    }
                }
                else if(c == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        isBalanced = false;
                    }
                }
            }
            if(!stack.isEmpty()){
                isBalanced = false;
            }
            sb.append(isBalanced ? "yes" : "no").append('\n');
            str = bufferedReader.readLine();
        }
        System.out.println(sb);
    }
}
