package 문자열변경;
//abcdefg => gfedcba
// 힌트 : for문을 이용
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        String str = sc.next();
        for ( int i = str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
//    Scanner sc = new Scanner(System.in);
//        System.out.print("문자를 입력 하세요 : ");
//                String str = sc.next();
//                char ch;
//                for (int i = 0; i < str.length(); i++){
//        ch = str.charAt(i);
//        if(ch < 'a') System.out.print((char) str.length()-i-1);


//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자 입력 : ");
//        String str = sc.next();
//        int index = str.length();
//        while(true){
//        index--;
//        System.out.print(str.charAt(index));
//        if (index == 0 ) break;