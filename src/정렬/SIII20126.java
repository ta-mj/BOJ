package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SIII20126 {
    static String str;
    static int N,M,S;
    static class Test implements Comparable<Test>{
        int start;
        int end;
        public Test(int s, int e){
            start = s;
            end = s + e;
        }
        @Override
        public int compareTo(Test o) {
            return (this.start - o.start);
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        str = bufferedReader.readLine();
        N = Integer.parseInt(str.split(" ")[0]);
        M = Integer.parseInt(str.split(" ")[1]);
        S = Integer.parseInt(str.split(" ")[2]);
        Test[] tests = new Test[N];
        for(int i = 0 ; i < N ; i++){
            str = bufferedReader.readLine();
            int start = Integer.parseInt(str.split(" ")[0]);
            int end = Integer.parseInt(str.split(" ")[1]);
            tests[i] = new Test(start,end);
        }
        Arrays.sort(tests);
        if(tests[0].start >= M){
            System.out.println(tests[0].start);
            return;
        }
        else{
            for(int i = 0 ; i < N - 1; i++){
                if((tests[i + 1].start - tests[i].end) >= M){
                    System.out.println(tests[i].end);
                    return;
                }
            }
            if((S - tests[tests.length - 1].end) >= M){
                System.out.println(tests[tests.length - 1].end);
                return;
            }
        }
        System.out.println(-1);
    }
}
