package Tv만들기;

public class TvMain {
    public static void main(String[] args) {
        TV smasungTv = new TV(); // 기본 생성자 호출
        TV lgTv = new TV(true, 59, 15); // 매개변수가 있는 생성자 호출

        lgTv.getTV();

        smasungTv.setON(true);
        smasungTv.setChannel(130);
        smasungTv.setVolume(30);
        smasungTv.getTV();
    }
}
