package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "개지림 그냥";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "타이타닉";
        movieReview2.review = "씹지림 그냥";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        // 영화 리뷰 정보 출력
        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 영화 리뷰: " + movieReview.review);
            System.out.println(movieReview.title + " " + movieReview.review);
        }
    }
}
