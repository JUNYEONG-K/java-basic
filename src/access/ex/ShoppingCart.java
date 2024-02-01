package access.ex;

public class ShoppingCart {
    private final int maxCount = 10;
    private int itemCount = 0;
    private final Item[] items = new Item[maxCount];

    public void addItem(Item item) {
        if (itemCount >= maxCount) {
            System.out.println("최대 개수");
            return;
        }

        items[itemCount++] = item;
    }

    public void displayItems() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
        }

        System.out.println("총합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}
