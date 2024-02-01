package polymorphism.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // overriding 된 함수는 항상 우선권을 가진다.
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(Animal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move(); // overriding 된 함수는 항상 우선권을 가진다.
        System.out.println("동물 이동 테스트 종료");
    }
}
