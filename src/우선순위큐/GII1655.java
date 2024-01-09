package 우선순위큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GII1655 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> lQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> rQueue = new PriorityQueue<>();
        StringBuilder stringBuilder = new StringBuilder();
        int num = Integer.parseInt(bufferedReader.readLine());
        lQueue.add(num);
        stringBuilder.append(num + "\n");
        for(int i = 1 ; i < n ; i++){
            num = Integer.parseInt(bufferedReader.readLine());
            if(lQueue.size() == rQueue.size()){
                if(num < rQueue.peek()){
                    lQueue.add(num);
                }
                else{
                    lQueue.add(rQueue.poll());
                    rQueue.add(num);
                }
                stringBuilder.append(lQueue.peek() + "\n");
            }
            else{
                if(num <= lQueue.peek()){
                    rQueue.add(lQueue.poll());
                    lQueue.add(num);
                }
                else{
                    rQueue.add(num);
                }
                stringBuilder.append(lQueue.peek() + "\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
