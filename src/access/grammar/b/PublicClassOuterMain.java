package access.grammar.b;

import access.grammar.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default 접근 제어자, 외부 패키지에서 호출 불가
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
