package polymorphism.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent(); // 메모리에 Parent 타입의 인스턴스만 생김
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child(); // 메모리에 Parent 타입과 Child 타입을 분리해서 하나로 가지는 인스턴스 생성
        child.parentMethod(); // 호출자의 타입에 따라 Child 타입부터 조회, 없으면 Parent 타입 조회
        child.childMethod(); // 호출자의 타입에 따라 Child 타입부터 조회, 없으면 Parent 타입 조회

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 메모리에 Parent 타입과 Child 타입을 분리해서 하나로 가지는 인스턴스 생성
        poly.parentMethod(); // 호출자의 타입에 따라 Parent 타입부터 조회
//        poly.childMethod(); // 컴파일 오류, 호출자의 타입에 따라 Parent 타입부터 조회, 그 후 Child 조회? ㄴㄴ Parent 는 Child 가 자기를 상속 받았는지 알지 못함.

//        Child parent1 = new Parent(); // 컴파일 오류, Parent 는 Child 가 자기를 상속 받았는지 알지 못함.
    }
}
