//package BinarySearch;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class SIII17393 {
//    static long N;
//    static long[] a,b;
//    public static long binarySearch(long start,long end,long num){
//        if(start > end){
//            return -1;
//        }else{
//            long mid = (start + end) / 2;
//            System.out.println(start + "," + mid + "," + end);
//            if(num < b[mid]){
//                return binarySearch(start, mid - 1, num);
//            }
//            else if(num == b[mid]){
//                return binarySearch(mid, end,num);
//            }
//            else{
//                return binarySearch(mid + 1, end, num);
//            }
//        }
//    }
//    public static void main(String args[]) throws IOException{
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        N = Integer.parseInt(bufferedReader.readLine());
//        a = new int[N];
//        b = new int[N];
//        StringTokenizer st1,st2;
//        st1 = new StringTokenizer(bufferedReader.readLine());
//        st2 = new StringTokenizer(bufferedReader.readLine());
//        for(int i = 0 ; i < N ; i++){
//            a[i] = Integer.parseInt(st1.nextToken());
//            b[i] = Integer.parseInt(st2.nextToken());
//        }
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0 ; i < N ; i++){
//            int index = binarySearch(0,N - 1, a[i]);
//            sb.append(index - i).append(' ');
//        }
//        System.out.println(sb);
//    }
//}
