package 문자열연결;
// 문자열 추가하기
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라, 두번째 문자열 앞에 추가하기
// ulkorea
// 3을 입력하면 oulkorea
// 힌트 1. substring(index) : 문자열의 시작 위치 부터 끝까지 잘라냄
// 힌트 2. substring 메소드를 이용해 문자열 추출하기 전에 index 계산이 필요함

import java.util.Scanner;

public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자를 입력하세요 : ");
        String fstStr = sc.next();
        System.out.print("두번째 문자를 입력하세요 : ");
        String secStr = sc.next();
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int position = fstStr.length() - n;  // 포지션 위치
        String sub = fstStr.substring(position);
        System.out.println(sub + secStr);
    }
}
