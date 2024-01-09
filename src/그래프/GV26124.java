package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GV26124 {
    static class Node{
        int x,y;
        int bright;
        boolean is_visited;
        public Node(int x_, int y_, int bright_, boolean is_visited_){
            x = x_;
            y = y_;
            bright = bright_;
            is_visited = is_visited_;
        }
    }
    static int h,w;
    static int result;
    static int[][] graph;
    static boolean[][] is_complete;
    static void bfs(int x, int y){
        Node node = new Node(x,y,graph[x][y],is_complete[x][y]);
        Queue queue = new LinkedList();
        queue.offer(node);
        while(!queue.isEmpty()){
            for(int i = 0 ; i < 4 ; i++){

            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        h = Integer.parseInt(str.split(" ")[0]);
        w = Integer.parseInt(str.split(" ")[1]);
        graph = new int[h][w];
        is_complete = new boolean[h][w];
        for(int i = 0 ; i < h ; i++){
            str = bufferedReader.readLine();
            for(int j = 0 ; j < w ; j++){
                graph[i][j] = Integer.parseInt(str.split(" ")[j]);
                is_complete[i][j] = false;
            }
        }
        System.out.println();

        for(int i = 0 ; i < h ; i++){
            for(int j = 0 ; j < w ; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }
}
