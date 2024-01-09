package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SIII2594 {
    public static class Time implements Comparable<Time>{
        int start;
        int end;
        Time(int s, int e){
            start = s;
            end = e;
        }
        @Override
        public int compareTo(Time t){
            return this.start - t.start;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Time> arrayList = new ArrayList<>();
        String[] time_str;
        int start,end;
        for(int i = 0 ; i < n ; i++){
            time_str = bufferedReader.readLine().split(" ");
            start = (Integer.parseInt(time_str[0]) / 100) * 60 + (Integer.parseInt(time_str[0]) % 100) - 10;
            end = (Integer.parseInt(time_str[1]) / 100) * 60 + (Integer.parseInt(time_str[1]) % 100) + 10;
            arrayList.add(new Time(start,end));
        }
        int time = 0;
        Collections.sort(arrayList);//시작시간 기준으로 정렬
        //첫번째 놀이 기구 운영 시작 시간이 10시 이후 일때
        if(arrayList.get(0).start > 10 * 60){
            time = arrayList.get(0).start - 10 * 60 ;
        }
        int last_end = arrayList.get(0).end;
        //다음 놀이기구 운영 시작 시간이 이전 놀이기구 운영 종료시간보다 늦을때
        for(int i = 0 ; i < n  ; i++){
            int second_start = arrayList.get(i).start;
            if(second_start > last_end){
                time = Math.max(time, second_start - last_end);
                last_end = arrayList.get(i).end;
            }
            else{
                last_end = Math.max(last_end, arrayList.get(i).end);
            }
        }
        //마지막 놀이 기구 운영 종료 시간이 10시 이전일때
        if(last_end < 22 * 60){
            time = Math.max(time, 22 * 60 - last_end);
        }
        System.out.println(time);
    }
}
