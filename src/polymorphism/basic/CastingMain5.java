package polymorphism.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            ((Child) parent).childMethod(); // 다운캐스팅 해도 괜찮음.
            System.out.println("Child 인스턴스 맞음.");
        } else {
            System.out.println("Child 인스턴스 아님.");
        }
    }
}
