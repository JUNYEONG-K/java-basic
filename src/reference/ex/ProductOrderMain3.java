package reference.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
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
