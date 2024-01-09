package 문자열;
import java.io.*;
public class GV20437 {
    static int short_len;
    static int long_len;
    static int n;
    static int target;
    static String str;
    static int[][] result;
    public static void game(int round){
        if(target == 1){
            result[round][0] = 1;
            result[round][1] = 1;
        }
        else {
            for (int i = 0; i < str.length() - 1; i++) {
                char c = str.charAt(i);
                int num = 1;
                int index = i + 1;
                while (index < str.length() && num < target) {
                    if (str.charAt(index) == c) {
                        num++;
                    }
                    index++;
                }
                if (num == target) {
                    short_len = Math.min(short_len, index - i);
                    long_len = Math.max(long_len, index - i);
                }
            }
            result[round][0] = short_len;
            result[round][1] = long_len;
        }
    }
    public static void main(String args[]) throws  IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        result = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            short_len = Integer.MAX_VALUE;
            long_len = Integer.MIN_VALUE;
            str = bufferedReader.readLine();
            target = Integer.parseInt(bufferedReader.readLine());
            game(i);
        }
        for(int i = 0 ; i < n ; i++){
            if(result[i][0] == Integer.MAX_VALUE || result[i][1] == Integer.MIN_VALUE){
                System.out.println(-1);
            }
            else{
                System.out.println(result[i][0] + " " + result[i][1]);
            }
        }
    }
}
