package reference.grammar;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; // 참조값, 즉 메모리 주소값이 null 임.
        data.value = 10; // NullPointerException 발생
        System.out.println("data.value = " + data.value);
    }
}
