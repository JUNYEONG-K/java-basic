package polymorphism.ex5;

public class Dog implements IAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 뛰어다닌다.");
    }
}
