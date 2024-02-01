package polymorphism.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();

        // 클라이언트는 driver, 기능을 제공하는 것은 ICar
        // car 가 아무리 변해도 driver 는 변화 x (OCP)
    }
}
