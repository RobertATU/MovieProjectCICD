package ie.atu.MovieProjectCICD;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class MovieService {
        private final movieSelectionRepo movieRepo;
        public List<movieSelection> getMovie()
        {
            return movieRepo.findAll();
        }

        public movieSelection getMovieSelection(String movieSelection) {
            movieSelection myMovie = new movieSelection("Horror",18,90);
            return myMovie;
        }


        public void saveMovieSelection(movieSelection movieSelection){movieRepo.save(movieSelection);}

        public void deleteMovieSelection(Long count) { movieRepo.deleteById(count);
        }

        public movieSelection findMovieSelectionByGenre(String genre) {return movieRepo.findMoviesByGenre(genre);
        }

        public List<movieSelection> findMovieSelectionByScoreRange(int score1, int score2)
        {
            return movieRepo.findAllByScore(score1,score2);
        }

}


