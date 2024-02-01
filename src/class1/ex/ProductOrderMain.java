package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "상품1";
        productOrder1.price = 10000;
        productOrder1.quantity = 1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "상품2";
        productOrder2.price = 20000;
        productOrder2.quantity = 2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "상품3";
        productOrder3.price = 30000;
        productOrder3.quantity = 3;

        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            totalPrice += productOrder.price * productOrder.quantity;
            System.out.println("상품명: " + productOrder.productName + ", 상품가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
        System.out.println("주문 총액: " + totalPrice);
    }
}
