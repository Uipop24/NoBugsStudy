package practice11.FilmRating;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MovieService {
    private Map<Movie, List<Rating>> movieListMap = new ConcurrentHashMap<>();

    public void addRatingToMovie(Movie movie, Rating rating){
        if(rating.getRating().doubleValue() <1 || rating.getRating().doubleValue() > 10){
            throw new IllegalArgumentException();
        }else {
            movieListMap.computeIfAbsent(movie, m -> new CopyOnWriteArrayList<>()).add(rating);
        }
    }

    public double avgRating(Movie movie){
        OptionalDouble avg = movieListMap.get(movie).stream()
                .mapToDouble(movieRate -> movieRate.getRating().doubleValue())
                .average();
        if(avg.isPresent()){
            return avg.getAsDouble();
        }else {
            throw new IllegalArgumentException("Фильма нет");
        }
    }

    public List<Movie> sortMoviesByRating(){
        return movieListMap.entrySet().stream()
                .sorted(Comparator.comparingDouble((Map.Entry<Movie, List<Rating>> entry) -> avgRating(entry.getKey())).reversed())
                .map(entry -> entry.getKey())
                .toList();
    }

    public List<Movie> getAllMovies(){
        return List.copyOf(movieListMap.keySet());
    }


    public List<Rating> getAllRating(Movie movie){
        return movieListMap.get(movie);

    }
}
