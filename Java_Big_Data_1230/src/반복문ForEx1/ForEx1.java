package 반복문ForEx1;

import java.util.Scanner;

// for 반복문 : for(초기식;조건식;증감식) { 반복 수행 구간}
public class ForEx1 {
        public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++) {
//            System.out.printf("%4d", i);
//            if (i % 10 == 0) System.out.println();
//        }
//    }
//}
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력 하세요 : ");
//        int number = sc.nextInt();
//        int sum = 0;
//        while(number > 0 ) {
//            sum += number; // sum = sum + number;
//            number --;
//        }
//        System.out.println("정수의 합은 : " + sum);
//    }
//}
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력 하세요 : ");
//        int number = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= number; i++) {
//            sum += i;
//        }
//        System.out.println("정수의 합은 : " + sum);
//    }
//}

//        public static void main (String[] args){
          Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력 하세요 : ");
            int number = sc.nextInt();
            int result = recursiveFunc(number);
            System.out.println(result);
        }
        public static int recursiveFunc(int n){
            if(n == 1) return 1;
            return n + recursiveFunc(n -1);
        }
    }



