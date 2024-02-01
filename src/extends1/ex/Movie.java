package extends1.ex;

public class Movie extends Item {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독: " + getDirector() + ", 배우: " + getActor());
    }
}
