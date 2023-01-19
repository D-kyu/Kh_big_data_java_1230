package 두번째숫자찾기;

import java.util.Scanner;

// 임의의 숫자를 10개를 입력 받아 2번째로 중복된 숫자 중 2번째로 등장하는 숫자의 위치 찾기 : 1 2 3 4 5 1 2 3 4 5
// 5 ==> 10
// 임의의 수 입력 : 1 2 3 4 5 5 7 8 2
// 찾을 수 :  5
// 결과 : 6
// 만약에 2번째 등장하는 수가 없으면 -1 출력
public class SecondNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;             // 몇 번째 나타나는 수인지 확인
        System.out.print("임의의 수 입력(10개) : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();       // 입력받은 각각의 임의의 수를 배열에 대입
        }
        System.out.print("찾을 수 입력 : ");
        int secondNum = sc.nextInt();
        for (int i = 0; i <= arr.length; i++){
            if(secondNum == arr[i]) {
                cnt++;
                if (cnt == 2){
                    System.out.print(i+1 + " ");
                    break;
                }
            }
        }
        if(cnt < 2)System.out.println("-1");
    }
}


