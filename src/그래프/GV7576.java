package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class GV7576 {
    public static int N,M;
    public static int[][] graph;
    public static int[] dr = {-1,1,0,0};
    public static int[] dc = {0,0,-1,1};
    public static int numRemain = 0, count = 0;
    public static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0 ; i < M ; i++){
            for(int j = 0 ; j < N ; j++){
                if(graph[i][j] == 1){
                    queue.offer(new int[]{i,j,0});
                }
                else if(graph[i][j] == 0){
                    numRemain++;
                }
            }
        }
        while (!queue.isEmpty() && numRemain != 0){
            int[] info = queue.poll();
            int r = info[0];
            int c = info[1];
            int day = info[2];
            for(int i = 0 ; i < 4; i++){
                int r_ = r + dr[i];
                int c_ = c + dc[i];
                if(0 <= r_ && r_ < M && 0 <= c_ && c_ < N && graph[r_][c_] == 0){
                    graph[r_][c_] = 1;
                    numRemain--;
                    queue.offer(new int[]{r_,c_,day + 1});
                    if(count < day + 1){
                        count++;
                    }
                }
            }
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[M][N];
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0 ; j < N ; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
        System.out.println(numRemain == 0 ? count : -1);
    }
}
