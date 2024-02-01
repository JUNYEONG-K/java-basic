package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "김영한", "35211");
        Album album = new Album("오보에", 15000, "양홍원");
        Movie movie = new Movie("인셉션", 18000, "크리스토퍼 놀란", "레오 디카프리오");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
