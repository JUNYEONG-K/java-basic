package polymorphism.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); // 메모리 인스턴스 상에 Parent 만 생김. 부모는 자식을 모른다. 상속 사실 조차 모름.
        Child child2 = (Child) parent2; // ClassCastException
        child2.childMethod(); // 호출자의 타입에 따라, 참조값을 따라 인스턴스 접근 후, Child 타입의 childMethod() 조회... 하지만 없다!
    }
}
