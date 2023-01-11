package 영화표예매;
// 영화표 예매하기 클래스를 만들고 객체 생성
// 극장의 좌석은 10개 (10개의 좌석 예약 상태를 기록하기 위한 배열 필요)
// 좌석당 가격은 12000원
// 메뉴는 예약하기와 종료로 구성
// 예약하기에서는 현자 좌석의 예약 상태를 보여주고 예약을 받음
// 종료는 판매된 좌석의 갯수를 확인해서 판매 금액을 구함 ( 3 * 12000 = 36000)
// 현재 좌석 상태를 보여주는 메소드가 필요
// 좌석을 예매하는 메소드가 필요
// 판매된 좌석의 갯수를 구해 총 판매 금액을 구하는 메소드가 필요

import java.util.Scanner;
public class MovieTicket {
    // 극장의 좌석 상태를 표시하는 배열 만들기(총 10개)
          int [] Seat = new int[10];
    // 좌석당 가격은 12000원
    // 현재 좌석 상태를 보여주는 메소드 작성
    // 0이면 [ ], 1이면 [V]
    void printSeat(){
        for (int i = 0; i < Seat.length; i++){
            if (0 == Seat[i]) System.out.print("[ ]"); // 예약이 가능한 자리
            else System.out.print("[V]");
        }
        System.out.println( );
    }
    // 좌석을 예약하는 메소드
    void selectSeat() {
        // printSeat() 호출해 현재 좌석 상태를 보여 줌
        printSeat();
        // 좌석 번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 문구 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력 해주세요 : ");
        int SeatNumber = sc.nextInt();
        if (Seat[SeatNumber - 1] == 0){
            Seat[SeatNumber - 1] = 1; // 좌석 판매
            printSeat(); // 좌석 판매 후 갱신된 정보를 화면에 보여 줌
        } else{
            System.out.println("예약된 자리 입니다. 다시 선택 해주세요 : ");
        }
    }
        // 좌석 예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여 줌
    int totalAmount() {
        int cnt = 0; // 예약된 좌석의 수를 누적하는 변수 생성
        // 좌석 예약 정보 가지고 있는 배열을 순회해 예약된 좌석 갯수를 누적
        for(int val : Seat) {
            if (val == 1) cnt++; // 예약된 좌석 갯수를 누적
        }
        // 좌석 갯수와 좌석당 가격을 곱해서 결과를 반환
        return cnt * 12000;
    }
}
