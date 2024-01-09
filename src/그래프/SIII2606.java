package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SIII2606 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());
        int[][] graph = new int[n + 1][n + 1];
        boolean[] is_visited = new boolean[n + 1];
        for(int i = 1 ; i <= n ; i++){
            is_visited[i] = false;
            for(int j = 1 ; j <= n ; j++){
                graph[i][j] = 0;
            }
        }
        for(int i = 1 ; i <= m ; i++){
            String[] str = bufferedReader.readLine().split(" ");
            int n1 = Integer.parseInt(str[0]);
            int n2 = Integer.parseInt(str[1]);
            graph[n1][n2] = graph[n2][n1] = 1;
        }
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        is_visited[1] = true;
        while(!queue.isEmpty()){
            int num = queue.poll();
            for(int i = 1 ; i <= n ; i++){
                if(graph[num][i] == 1  && !is_visited[i]){
                    queue.offer(i);
                    is_visited[i] = true;
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
