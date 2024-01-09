package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SI2178 {
    static int n,m;
    static int[][] graph;
    static boolean[][] is_visited;
    static int result = Integer.MAX_VALUE;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        graph = new int[n + 1][m + 1];
        is_visited = new boolean[n + 1][m + 1];
        for(int i = 1 ; i <= n ; i++){
            str = bufferedReader.readLine().split("");
            for(int j = 1 ; j <= m ; j++){
                is_visited[i][j] = false;
                graph[i][j] = Integer.parseInt(str[j - 1]);
            }
        }
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{1,1,1});// 첫 두 요소는 미로 좌표, 세번째 요소는 이동 칸수
        is_visited[1][1] = true;
        while (!queue.isEmpty()){
            Integer[] info = queue.poll();
            for(int i = 0 ; i < 4; i ++){
                int r_ = info[0] + dr[i];
                int c_ = info[1] + dc[i];
                int count = info[2];
                if(1 <= r_ && r_ <= n && 1 <= c_ && c_ <= m
                        && graph[r_][c_] == 1 && !is_visited[r_][c_]){
                    if(r_ == n && c_ ==m){
                        System.out.println(++count);
                        return;
                    }
                    else{
                        is_visited[r_][c_] = true;
                        queue.offer(new Integer[]{r_,c_, count + 1});
                    }
                }
            }
        }
        System.out.println(result);
    }
}
