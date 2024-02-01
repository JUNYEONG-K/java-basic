package polymorphism.ex4;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 뛴다.");
    }
}
