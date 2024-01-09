package Greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SI20921 {
    public static void makeSome(int[] people, int k){
        int left = k;
        int n = people.length;
        int i_first = 0;
        int i_last = n - 1;
        int[] result = new int[n];
        int i_r = 0;//result 접근 index
        while(left > 0){
            if(left >= i_last - i_first){
                result[i_r] = people[i_last];
                left -= (i_last - i_first);
                i_r ++;
                i_last --;
            }
            else{
                result[i_r] = people[i_first];
                i_first++;
                i_r++;
            }
        }
        while(i_first <= i_last){
            result[i_r] = people[i_first];
            i_r++;
            i_first++;
        }
        for(int i = 0 ; i < people.length ; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" "); // 공백을 기준으로 문자열을 나눔
        int n = Integer.parseInt(input[0]); // 첫 번째 정수
        int k = Integer.parseInt(input[1]); // 두 번째 정수
        int[] people = new int[n];
        for(int i = 0 ; i < n ; i++){
            people[i] = i + 1;
        }
        makeSome(people, k);
    }
}
