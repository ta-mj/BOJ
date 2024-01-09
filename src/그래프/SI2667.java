package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SI2667 {
    static int n;
    static int[][] graph;
    static boolean[][] is_visited;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    public static int bfs(int r, int c){
        int result = 1;
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{r,c});
        while(!queue.isEmpty()){
            Integer[] num = queue.poll();
            for(int i = 0 ; i < 4;  i++){
                int r_ = num[0] + dr[i];
                int c_ = num[1] + dc[i];
                if(1 <= r_ && r_ <= n && 1 <= c_ && c_ <= n
                        && graph[r_][c_] == 1 && !is_visited[r_][c_]){
                    result++;
                    is_visited[r_][c_] = true;
                    queue.offer(new Integer[]{r_,c_});
                }
            }
        }
        return result;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        graph = new int[n + 1][n + 1];
        is_visited = new boolean[n+1][n+1];
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i = 1 ; i <= n ; i++){
            String[] str = bufferedReader.readLine().split("");
            for(int j = 1 ; j <= n ; j++){
                graph[i][j] = Integer.parseInt(str[j - 1]);
                is_visited[i][j] = false;
            }
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(graph[i][j] == 1 && !is_visited[i][j]){
                    is_visited[i][j] = true;
                    arrayList.add(bfs(i,j));
                }
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for(Integer i : arrayList){
            System.out.println(i);
        }
    }
}
