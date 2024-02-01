package polymorphism.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon();

        InterfaceA childA = new Child();
        childA.methodA();
        childA.methodCommon();

        InterfaceB childB = new Child();
        childB.methodB();
        childB.methodCommon();
    }
}
