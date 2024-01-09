package 문자열;
import java.util.Scanner;
import java.util.regex.Pattern;

/*최근 김동혁 박사는 아레시보 전파망원경에서
star Vega(직녀성) 으로부터 수신한 전파 기록의 일부를 조사하여
그 전파들의 패턴을 분석하여 아래와 같이 기록하였다.
(100+1+ | 01)+
김동혁 박사는 다양한 전파 기록 중에서 위의 패턴을 지니는 전파를 가려내는 프로그램을 필요로 한다.
이를 수행할 수 있는 프로그램을 작성하라.*/
public class GV1013 {
    public static boolean Contact(String s){
        String regex = "((100+1+)|(01))+";
        return Pattern.matches(regex,s);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        n = sc.nextInt();
        boolean[] result = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            s = sc.next();
            result[i] = Contact(s);
        }
        for(int i = 0 ; i < n ; i++){
            if(result[i]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
