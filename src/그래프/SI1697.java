package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SI1697 {
    public static int min = Integer.MAX_VALUE;
    public static int N,K;
    public static boolean[] isVisited = new boolean[100000 + 1];
    public static void bfs(){
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{N, 0});
        while (!queue.isEmpty()){
            Integer[] info = queue.poll();
            int x = info[0];
            int second = info[1];
            if(x == K){
                min = Math.min(min, second);
            }
            else{
                if(x - 1 >= 0 && !isVisited[x - 1]){
                    isVisited[x - 1] = true;
                    queue.offer(new Integer[]{x - 1, second + 1});
                }
                if(x + 1 <= 100000 && !isVisited[x + 1]){
                    isVisited[x + 1] = true;
                    queue.offer(new Integer[]{x + 1, second + 1});
                }
                if(x * 2 <= 100000 && !isVisited[x * 2]){
                    isVisited[x * 2] = true;
                    queue.offer(new Integer[]{x * 2, second + 1});
                }
            }
        }
        System.out.println(min);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        bfs();
    }
}
