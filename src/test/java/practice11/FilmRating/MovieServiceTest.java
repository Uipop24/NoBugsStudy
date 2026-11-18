package practice11.FilmRating;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    public static Stream<Arguments> moviesWithCorrectRating() {
        return Stream.of(
                Arguments.of("Титаник", 1),
                Arguments.of("Титаник", 2),
                Arguments.of("Титаник", 9),
                Arguments.of("Титаник", 10)
        );
    }

    public static Stream<Arguments> moviesWithIncorrectRating() {
        return Stream.of(
                Arguments.of("Титаник", 0),
                Arguments.of("Титаник", 11)
        );
    }

    @ParameterizedTest
    @MethodSource("moviesWithCorrectRating")
    public void checkCorrectRating(String name, int rating) {
        MovieService movieService = new MovieService();
        assertDoesNotThrow(() -> movieService.addRatingToMovie(new Movie(name), new Rating<>(rating)));
    }

    @ParameterizedTest
    @MethodSource("moviesWithIncorrectRating")
    public void checkIncorrectRating(String name, int rating) {
        MovieService movieService = new MovieService();
        assertThrows(IllegalArgumentException.class, () -> movieService.addRatingToMovie(new Movie(name), new Rating<>(rating)));
    }

    @Test
    public void checkAddedMovieIntoEmptyList() {
        MovieService movieService = new MovieService();
        movieService.addRatingToMovie(new Movie("Гладиатор"), new Rating<>(10));
        Movie actualMovie = movieService.getAllMovies().getFirst();
        Movie expectedMovie = new Movie("Гладиатор");
        assertEquals(expectedMovie, actualMovie);
    }

    @Test
    public void checkAddedMovieInListWithSameMovie() {
        MovieService movieService = new MovieService();
        movieService.addRatingToMovie(new Movie("Гладиатор"), new Rating<>(10));
        movieService.addRatingToMovie(new Movie("Гладиатор"), new Rating<>(9));
        int actualSize = movieService.getAllMovies().size();
        int expectedSize = 1;
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void checkAvgRating() {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Гладиатор");
        Movie movie2 = new Movie("Титаник");
        Rating rating = new Rating<>(10);
        Rating rating2 = new Rating<>(1);
        Rating rating3 = new Rating<>(2);
        Rating rating4 = new Rating<>(3);
        movieService.addRatingToMovie(movie, rating);
        movieService.addRatingToMovie(movie, rating2);
        movieService.addRatingToMovie(movie2, rating3);
        movieService.addRatingToMovie(movie2, rating4);
        double actualAvgRating = movieService.avgRatingOfMovie(movie);
        double expectedAvgRating = 5.5;
        assertEquals(expectedAvgRating, actualAvgRating);
    }

    @Test
    public void checkAvgRatingOfMovieNotInList() {
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Гладиатор");
        assertThrows(NullPointerException.class, () -> movieService.avgRatingOfMovie(movie));
    }


    @Test
    public void checkSorting(){
        MovieService movieService = new MovieService();
        Movie movie = new Movie("Гладиатор");
        Movie movie2 = new Movie("Титаник");
        Rating rating = new Rating<>(10);
        Rating rating2 = new Rating<>(1);
        Rating rating3 = new Rating<>(2);
        Rating rating4 = new Rating<>(3);
        movieService.addRatingToMovie(movie, rating);
        movieService.addRatingToMovie(movie, rating2);
        movieService.addRatingToMovie(movie2, rating3);
        movieService.addRatingToMovie(movie2, rating4);
        List<Movie> actualSortedMovies = movieService.sortMoviesByAvgRating();
        List<Movie> expectedSortedMovies = List.of(movie, movie2);
        assertEquals(expectedSortedMovies, actualSortedMovies);
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
        assertEquals(threadsCount * ratingsPerThread, movieService.getRatingsOfMovie(movie).size());
    }


}

