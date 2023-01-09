package 배열기본;

public class BasicArray {
    public static void main(String[] args) {
        int[] score = {80, 90, 70}; // 타입[] 참조 변수 = new 타입[크기];
        int sum = 0;
        for(int i = 0; i < score.length; i++){
            sum += score[i]; // sum = sum + score[i]
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n ", (double)sum/score.length);
    }
}