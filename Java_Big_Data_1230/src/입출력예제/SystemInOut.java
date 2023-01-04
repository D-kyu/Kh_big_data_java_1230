package 입출력예제;
// "" 문자열, '' 문자

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "제주감귤";
        String addr = "서울시 송파구";
        char gender = '남';
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
         // 자바 스타일 (메소드를 오버로딩 하는 방식)
        System.out.println("======= Java style output =======");
        System.out.println("Name : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat));
        System.out.println("평균 : " +((double)(kor + eng + mat)/3));

        // c언어 스타일(서식지정자를  사용)
        // 서식지정자 : %d, %Ld, %u, %f, %.2f, %c, %%, %b
        // 이스케이프시퀀스 : \n(줄바꿈), \r(CR), \t(탭), \b(백스페이스), \\
        System.out.printf("======= Java style output =======\n");
        System.out.printf("이름 : %s, 주소 : %s\n", name, addr);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat)/3);


        System.out.print("Apple\rBanana\tKiwi\n");

        System.out.println("\"Enter\" 키를 입력하시면 종료 됩니다");
        System.out.println("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%\n", 25);



        }
    }
