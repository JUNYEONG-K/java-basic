package polymorphism.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // overriding 된 함수는 항상 우선권을 가진다.
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
