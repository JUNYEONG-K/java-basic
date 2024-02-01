package polymorphism.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        IAnimal[] animals = {new Dog(), new Cat(), new Cow()};

        for (IAnimal animal : animals) {
            System.out.println("다리 개수: " + IAnimal.LEG_COUNTS);
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(IAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // overriding 된 함수는 항상 우선권을 가진다.
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(IAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move(); // overriding 된 함수는 항상 우선권을 가진다.
        System.out.println("동물 이동 테스트 종료");
    }
}
