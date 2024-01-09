package 수학;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BIII9501 {
    public static void main(String args[]) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0 ; i < t ; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                st = new StringTokenizer(bufferedReader.readLine());
                float v = Float.parseFloat(st.nextToken());
                float f = Float.parseFloat(st.nextToken());
                float c = Float.parseFloat(st.nextToken());
                if(v * (f / c) >= d){
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
