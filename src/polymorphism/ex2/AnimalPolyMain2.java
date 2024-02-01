package polymorphism.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        Animal[] animals = {dog, cat, cow, duck};

        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound(); // overriding 된 함수는 항상 우선권을 가진다.
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
