package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.charge();
        electricCar.move(); // Car 클래스의 메서드를 상속 받아 활용
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move(); // Car 클래스의 메서드를 상속 받아 활용
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
        hydrogenCar.openDoor();
    }
}
