package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BII23292 {
    public static int bioRhythm(String birth, String date){
        int result = 0;
        int year = 0;
        int month = 0;
        int day = 0;
        for(int i = 0 ; i < 4 ; i++){
            year += Math.pow(((birth.charAt(i) - '0') - (date.charAt(i) - '0')),2);
        }
        for(int i = 4 ; i < 6 ; i++){
            month += Math.pow(((birth.charAt(i) - '0') - (date.charAt(i) - '0')),2);
        }
        for(int i = 6 ; i < 8 ; i++){
            day += Math.pow(((birth.charAt(i) - '0') - (date.charAt(i) - '0')),2);
        }
        return year * month * day;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String birth = bufferedReader.readLine();
        int num = Integer.parseInt(bufferedReader.readLine());
        String[] dates = new String[num];
        for(int i = 0 ; i < num ; i++){
            dates[i] = bufferedReader.readLine();
        }
        int max = Integer.MIN_VALUE;
        String result = "";
        Arrays.sort(dates);
        for(String date : dates){
            int rhythm = bioRhythm(birth,date);
            if(rhythm > max){
                max = rhythm;
                result = date;
            }
        }
        System.out.println(result);
    }
}
