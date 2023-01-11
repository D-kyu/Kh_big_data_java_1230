package 시간입력;

import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 클론(:) 기준으로 입력
// 출력 : 오후 11시 05분 03초
public class TimesSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 : " + "분을 입력하세요 : " + "초를 입력하세요 : ");
        String times = sc.next();
        String[] splitTime = times.split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int min = Integer.parseInt(splitTime[1]);
        int sec = Integer.parseInt(splitTime[2]);
        if (hour > 11) {
            hour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n", hour, min, sec);
        }else {
            System.out.printf("오후 %02d시 %02d분 %02d초\n", hour, min, sec);
        }
    }
}


