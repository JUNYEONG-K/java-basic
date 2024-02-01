package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.charge();
        electricCar.move(); // ElectricCar 클래스의 move 함수 호출
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
