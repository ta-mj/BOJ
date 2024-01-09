package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIII2859 {
    public static String[] day = {"Saturday", "Sunday", "Monday",
            "Tuesday", "Wednesday", "Thursday", "Friday"};
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(":");
        int firstStart = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        str = bufferedReader.readLine().split(":");
        int secondStart = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        str = bufferedReader.readLine().split(":");
        int firstPeriod = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        str = bufferedReader.readLine().split(":");
        int secondPeriod = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        int endTime = 24 * 7 * 60;
        int firstTime = firstStart;
        int secondTime = secondStart;
        for(int i = 0 ; i < 1440 ; i++){
            int first = firstTime + firstPeriod * i;
            if(first >= secondStart && (first - secondStart) % secondPeriod == 0){
                int min = first % 60;
                first /= 60;
                int hour = first % 24;
                first /= 24;
                System.out.println(day[first % 7]);
                System.out.format("%02d:%02d", hour, min);
                return;
            }
        }
        System.out.println("Never");
    }
}
