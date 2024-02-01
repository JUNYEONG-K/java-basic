package static1.grammar;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A"); // 힙 영역에 객체 생성
        System.out.println("data1.count = " + Data3.count);
        // static 변수 -> method 영역에서 관리, method 영역에서는 클래스와 클래스 내부 함수, static 변수 관리

        Data3 data2 = new Data3("B");
        System.out.println("data2.count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("data3.count = " + Data3.count);
    }
}
