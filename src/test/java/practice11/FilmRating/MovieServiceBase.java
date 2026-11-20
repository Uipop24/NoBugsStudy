package practice11.FilmRating;

import org.junit.jupiter.api.BeforeEach;

public class MovieServiceBase {
    protected MovieService movieService;

    @BeforeEach
    protected void setUp(){
        movieService = new MovieService();
    }
}
