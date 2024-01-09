package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SV5635 {
    public static class Birthday implements Comparable<Birthday>{
        String name;
        int year,month,day;
        public Birthday(String n, int d, int m, int y){
            name = n;
            year = y;
            month = m;
            day = d;
        }

        @Override
        public int compareTo(Birthday o) {
            if(this.year == o.year && this.month == o.month){
                return o.day - this.day;
            }
            else if(this.year == o.year){
                return o.month - this.month;
            }
            return o.year - this.year;
        }

    }
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer t;
        Birthday[] birthdays = new Birthday[n];
        for(int i = 0 ; i < n ; i++){
            t = new StringTokenizer(bufferedReader.readLine());
            birthdays[i] = new Birthday(t.nextToken(),Integer.parseInt(t.nextToken()),
                    Integer.parseInt(t.nextToken()), Integer.parseInt(t.nextToken()));
        }
        Arrays.sort(birthdays);
        System.out.println(birthdays[0].name);
        System.out.println(birthdays[n - 1].name);
    }
}
