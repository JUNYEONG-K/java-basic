package static2.grammar;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 어떤 인스턴스의 변수 혹은 메서드에 접근하는지 알 수 없기 때문
//        instanceValue++; // 인스턴스 변수 접근, compile error
//        instanceMethod(); // 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
