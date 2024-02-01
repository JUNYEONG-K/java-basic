package polymorphism.ex6;

public class Chicken extends Animal implements IFly {
    @Override
    public void sound() {
        System.out.println("꼬끼오~!");
    }

    @Override
    public void fly() {
        System.out.println("닭이 날다.");
    }
}
