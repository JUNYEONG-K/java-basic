package reference.grammar;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // x001
        System.out.println("2. data = " + data);
        data = null; // x001 이라는 주소에 두 번 다시 접근할 수 없음. 따로 기록해둔 것이 아니기 때문. 이렇게 되면 JVM 의 GC 가 인스턴스를 메모리에서 자동으로 제거해줌.
        System.out.println("3. data = " + data);
    }
}
