package 그래프;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SII11724 {
    static int N,M,count;
    static int[][] graph;
    static boolean[] isVisited;
    public static void bfs(int num){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);
        isVisited[num] = true;
        while (!queue.isEmpty()){
            int start = queue.poll();
            for(int i = 1 ; i <= N ; i++){
                if((graph[start][i] == 1 || graph[i][start] == 1) && !isVisited[i]){
                    queue.offer(i);
                    isVisited[i] = true;
                }
            }
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        count = 0;
        graph = new int[N + 1][N + 1];
        isVisited = new boolean[N + 1];
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }
        for(int i = 1 ; i <= N ; i++){
            if(!isVisited[i]){
                count++;
                bfs(i);
            }
        }
        System.out.println(count);
    }
}
