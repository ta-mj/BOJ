package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SII2644 {
    static int n, m, start, end;
    static int[][] graph;
    static boolean[] is_vistied;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        start = Integer.parseInt(stringTokenizer.nextToken());
        end = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(bufferedReader.readLine());
        graph = new int[n+1][n+1];
        is_vistied = new boolean[n+1];
        for(int i = 1 ; i <= n ; i++){
            is_vistied[i] = false;
            for(int j = 1 ; j <= n ; j++){
                graph[i][j] = 0;
            }
        }
        for(int i = 0 ; i < m ; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int r = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            graph[r][c] = graph[c][r] = 1;
        }
        is_vistied[start] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start,0});
        while(!queue.isEmpty()){
            int[] info = queue.poll();
            int num = info[0];
            int count = info[1];
            for(int i = 1 ; i <= n ; i++){
                if(graph[num][i] == 1 && !is_vistied[i]){
                    if(i == end){
                        System.out.println(count + 1);
                        return;
                    }
                    else{
                        is_vistied[i] = true;
                        queue.offer(new int[]{i, count + 1});
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
