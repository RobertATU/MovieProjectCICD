package ie.atu.MovieProjectCICD;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.channels.FileChannel;
import java.util.List;
@AllArgsConstructor
@Service
public class MovieService {
        private final movieSelectionRepo movieRepo;
        public List<movieSelection> getMovies()
        {
            return movieRepo.findAll();
        }

        public movieSelection getMovie(String score) {
            movieSelection myMovie = new movieSelection("Oscars Oasis","Horror",18,90);
            return myMovie;
        }


        public void saveMovie(movieSelection movieSelection){movieRepo.save(movieSelection);}

        public void deleteMovieSelection(Long count) { movieRepo.deleteById(count);
        }

        public movieSelection findMovieSelectionByGenre(String genre) {return movieRepo.findMoviesByGenre(genre);
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


