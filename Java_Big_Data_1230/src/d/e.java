package d;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("문자열 입력 : ");
            String str = sc.nextLine();
            if(str.equals(str)) {
                break;
            } else {
                System.out.println(str.length() + "글자 입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
