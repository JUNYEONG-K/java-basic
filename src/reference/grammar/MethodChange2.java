package reference.grammar;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        System.out.println("메서드 호출 전: data.value = " + data.value);
        changeReference(data);
        System.out.println("메서드 호출 후: data.value = " + data.value);
    }

    public static void changeReference(Data data) { // 인스턴스의 메모리 주소값이 인자로 넘어옴.
        data.value = 20;
    }
}
