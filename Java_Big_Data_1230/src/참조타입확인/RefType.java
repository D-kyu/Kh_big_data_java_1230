package 참조타입확인;
// 참조 변수의 == (같음을 확인?)
public class RefType {
    public static void main(String[] args) {
        String name1 = "김동규";
        String name2 = "김동규";
        String name3 = new String("김동규");
        if(name1 == name2) {
            System.out.println("두개의 이름에 대한 참조가 같음");
        } else {
            System.out.println("두개의 이름에 대한 참조가 다름");
        }
        if(name1.equals(name3)){
            System.out.println("두개의 이름의 내용이 같음");
        }else {
            System.out.println("두개의 이름의 내용이 다름");
        }
    }
}




//        int x = 0;
//        String stt = null; // 참조타입의 변수가 객체를 참조하지 않는다는 의미
//        int[] intArray = null;