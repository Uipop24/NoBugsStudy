package practice11.FilmRating;

public class Rating <T extends Number>{
    private T rating;

    public Rating(T rating) {
        this.rating = rating;
    }

    public T getRating() {
        return rating;
    }




}
