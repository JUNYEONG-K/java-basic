package polymorphism.ex6;

public class Bird extends Animal implements IFly {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날다.");
    }
}
