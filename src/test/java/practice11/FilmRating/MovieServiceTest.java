package practice11.FilmRating;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest extends MovieServiceBase{

    public static Stream<Arguments> movieWithCorrectRating(){
        return Stream.of(
                Arguments.of("Titanic", 1),
                Arguments.of("Titanic", 10),
                Arguments.of("Titanic", 2),
                Arguments.of("Titanic", 9)
        );
    }

    public static Stream<Arguments> movieWithIncorrectRating(){
        return Stream.of(
                Arguments.of("Titanic", -1),
                Arguments.of("Titanic", 11)
        );
    }

    @ParameterizedTest
    @MethodSource("movieWithCorrectRating")
    public void checkCorrectRating(String name, int rating){
        assertDoesNotThrow(() -> movieService.addRatingToMovie(new Movie(name), new Rating<>(rating)));
    }

    @ParameterizedTest
    @MethodSource("movieWithIncorrectRating")
    public void checkIncorrectRating(String name, int rating){
        assertThrows(IllegalArgumentException.class, () -> movieService.addRatingToMovie(new Movie(name), new Rating<>(rating)));
    }

    @Test
    public void checkAddMovieToEmptyList(){
        movieService.addRatingToMovie(new Movie("Titanic"), new Rating<>(10));
        Movie actualMovie = movieService.getAllMovies().getFirst();
        Movie expectedMovie = new Movie("Titanic");
        assertEquals(expectedMovie, actualMovie);
    }

    @Test
    public void checkSizeOfMovieList(){
        movieService.addRatingToMovie(new Movie("Titanic"), new Rating<>(10));
        int actualSize = movieService.getAllMovies().size();
        int expectedSize = 1;
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void checkAvgRating(){
        Movie movie1 = new Movie("Gladiator");
        movieService.addRatingToMovie(new Movie("Titanic"), new Rating<>(10));
        movieService.addRatingToMovie(new Movie("Titanic"), new Rating<>(4.5));
        movieService.addRatingToMovie(new Movie("Gladiator"), new Rating<>(6));
        movieService.addRatingToMovie(new Movie("Gladiator"), new Rating<>(8.9));
        double actualAvgRating = movieService.avgRating(movie1);
        double expectedRating = 7.45;
        assertEquals(expectedRating, actualAvgRating);
    }

    @Test
    public void checkAvgRatingThatNotInList(){
        Movie movie = new Movie("Titanic");
        assertThrows(NullPointerException.class,() -> movieService.avgRating(movie));
    }

    @Test
    public void checkSorting(){
        Movie movie1 = new Movie("Gladiator");
        Movie movie = new Movie("Titanic");
        movieService.addRatingToMovie(new Movie("Titanic"), new Rating<>(10));
        movieService.addRatingToMovie(new Movie("Titanic"), new Rating<>(4.5));
        movieService.addRatingToMovie(new Movie("Gladiator"), new Rating<>(6));
        movieService.addRatingToMovie(new Movie("Gladiator"), new Rating<>(8.9));
        List<Movie> actual = movieService.sortMoviesByRating();
        List<Movie> expected = List.of(movie1, movie);
        assertEquals(expected, actual);
    }

    @Test
    public void checkThreadSafety() throws InterruptedException {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Гладиатор");
        int threadsCount = 10;
        int ratingsPerThread = 100;
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < threadsCount; i++) {
            threads.add(new Thread(() -> {
                for (int j = 0; j < ratingsPerThread; j++) {
                    movieService.addRatingToMovie(movie, new Rating<>(1));
                }
            }));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        assertEquals(threadsCount * ratingsPerThread, movieService.getAllRating(movie).size());
    }

}
