package polymorphism.car1;

public class Driver {
    ICar car;

    public void setCar(ICar car) {
        System.out.println(car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
