package reference.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        productOrders[0] = createOrder("상품1", 10000, 1);
        productOrders[1] = createOrder("상품2", 20000, 2);
        productOrders[2] = createOrder("상품3", 30000, 3);
        // printOrders()를 사용해서 상품의 주문 정보 출력
        printOrders(productOrders);
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int total = getTotalAmount(productOrders);
        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 상품가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int total = 0;
        for (ProductOrder productOrder : productOrders) {
            total += productOrder.price * productOrder.quantity;
        }
        return total;
    }
}
