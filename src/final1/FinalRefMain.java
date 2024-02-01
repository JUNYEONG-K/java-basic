package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // data 에는 이미 메모리 주소값 (참조값) 들어있음.

        // 참조 대상의 값은 변경 가능 (해당 클래스의 value 필드는 final 아님.)
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
