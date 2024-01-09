package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SIII24511 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] stackOrQueue = new int[N];
        Deque<Integer> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0 ; i < N ; i++){
            stackOrQueue[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0 ; i < N ; i++){
            int num = Integer.parseInt(st.nextToken());
            if(stackOrQueue[i] == 0){
                deque.addLast(num);
            }
        }
        int M = Integer.parseInt(bufferedReader.readLine());
        st = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < M ; i++){
            deque.addFirst(Integer.parseInt(st.nextToken()));
            stringBuilder.append(deque.pollLast() + " ");
        }
        System.out.println(stringBuilder);
    }
}
