package polymorphism.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) { // 다형적 참조 덕분에 animal 변수는 Animal 인스턴스 외에도 Dog, Cat, Cow 인스턴스를 참조할 수 있다.
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // overriding 된 함수는 항상 우선권을 가진다.
        System.out.println("동물 소리 테스트 종료");
    }
}
