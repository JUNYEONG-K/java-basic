package polymorphism.ex5;

public interface IAnimal {
    int LEG_COUNTS = 4; // 상수 사용 가능, static final 생략
    void sound(); // public abstract 생략
    void move();
}
