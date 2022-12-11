package ie.atu.MovieProjectCICD;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.channels.FileChannel;
import java.util.List;
@AllArgsConstructor
@Service
public class MovieService {
    private EmailSender sender;
        private final movieSelectionRepo movieRepo;
        public List<movieSelection> getMovies()
        {
            return movieRepo.findAll();
        }

        public movieSelection getMovie(int score) {
            movieSelection myMovie = new movieSelection("Oscars Oasis","Horror",18,90);
            return myMovie;
        }


        public void saveMovie(movieSelection movieSelection){movieRepo.save(movieSelection);}

        public void deleteMovieSelection(Long count) { movieRepo.deleteById(count);
        }

        public movieSelection findMovieSelectionByGenre(String genre) {
            movieSelection movie = movieRepo.findMoviesByGenre(genre);
            sender.sendEmail("g00395612@atu.ie", "Movie Recommendation", "Dear Customers, " +
                    "We thought you might enjoy this Movie: " + movie.toString());

            return movie;
        }

        public List<movieSelection> findMovieSelectionByScoreRange(int score1, int score2)
        {
            return movieRepo.findAllByScore(score1,score2);
        }

    public List<movieSelection> findMovieSelectionByAgeRange(int score1, int score2)
    {
        return movieRepo.findAllByScore(score1,score2);
    }

    public void editMovie(movieSelection movie) {movieRepo.save(movie);
    }
}


