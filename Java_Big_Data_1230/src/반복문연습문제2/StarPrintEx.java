package 반복문연습문제2;

import java.util.Scanner;

// 입력 : 5
// *
// **
// ***
// ****
// *****
public class StarPrintEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별의 갯수를 입력 하세요 : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}





//    Scanner sc = new Scanner(System.in);
 //      System.out.print("별의 갯수를 입력 하세요 : ");
//        int number = sc.nextInt();
//        for (int i = 0; i < number; i++){
//            System.out.printf("|%d|", i);
//            for(int j = 0; j < number; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();