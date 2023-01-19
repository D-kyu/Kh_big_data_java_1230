package 상속이있는TV;
// 상속관계가 있는 TV
// 오버라이딩 적용
public class InheritanceTv {
    public static void main(String[] args) {
        ProductTv LgTV = new ProductTv("우리집 TV");
        LgTV.setPower(true);
        LgTV.setVolume(12);
        LgTV.setChannel(19, true);
        LgTV.viewTV();
    }
}
