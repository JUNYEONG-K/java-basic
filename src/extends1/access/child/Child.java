package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지
//        defaultValue = 1; // 같은 패키지 -> 다른 패키지이기 때문에 접근 불가, 컴파일 오류
//        privateValue = 1; // 같은 클래스 -> 다른 클래스이기 때문에 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
