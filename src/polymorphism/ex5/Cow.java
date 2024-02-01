package polymorphism.ex5;

public class Cow implements IAnimal {
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 움직인다.");
    }
}
