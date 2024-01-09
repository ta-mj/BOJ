package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.concurrent.Flow;

public class GIII2457 {
    public static int[] dayOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static int[] sumDayOfMonth;
    public static class Flower implements Comparable<Flower> {
        int start;
        int end;
        Flower(int s, int e){
            start = s;
            end = e;
        }

        @Override
        public int compareTo(Flower o) {
            //피는 시간이 같은 꽃은 더 늦게 지는 꽃이 우선되도록 정렬을 해야할까?
            return this.start - o.start;
        }
    }
    public static void main(String args[]) throws IOException{
        sumDayOfMonth = new int[13];
        int sum = 0;
        for(int i = 1 ; i <= 12 ; i++){
            sumDayOfMonth[i] = sum;
            sum += dayOfMonth[i];
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        Flower[] flowers = new Flower[N];
        StringTokenizer st;
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            int s_m = Integer.parseInt(st.nextToken());
            int s_d = Integer.parseInt(st.nextToken());
            int e_m = Integer.parseInt(st.nextToken());
            int e_d = Integer.parseInt(st.nextToken());
            //정렬을 쉽게 하기 위해 교정작업
            //3월 1일 이전에 피는 꽃은 3월 1일에 피는 것으로
            if(sumDayOfMonth[s_m] + s_d <= sumDayOfMonth[3] + 1){
                s_m = 3;
                s_d = 1;
            }
            //11월 30일 이후에 진 꽃은 11월 30일에 지는 것으로
            if(sumDayOfMonth[e_m] + e_d >= sumDayOfMonth[12] + 1){
                e_m = 12;
                e_d = 1;
            }
            flowers[i] = new Flower(sumDayOfMonth[s_m] + s_d, sumDayOfMonth[e_m] + e_d);
        }
        Arrays.sort(flowers);
        for(Flower f : flowers){
            System.out.println(f.start + "," + f.end);
        }
        int startDay = sumDayOfMonth[3] + 1;
        int endDay = sumDayOfMonth[12] + 1;
        int result = 0;
        int end_temp = startDay;
        for(int i = 0 ; i < flowers.length ; i++){
            if(flowers[i].start <= startDay){
                if (flowers[i].end >= endDay) {
                    System.out.println(++result);
                    return;
                }
                else{
                    if(flowers[i].end > startDay) {
                        end_temp = Math.max(end_temp, flowers[i].end);
                    }
                }
            }
            else{
                result++;
                startDay = end_temp;
                i--;
            }
        }
        System.out.println(0);
    }
}
