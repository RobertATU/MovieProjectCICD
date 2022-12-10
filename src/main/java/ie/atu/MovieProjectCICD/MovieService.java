package ie.atu.MovieProjectCICD;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

public class MovieService {
    @AllArgsConstructor
    @Service
    public class MovieService {
        private final MovieRepo MovieRepo;
        public List<movieSelection> getMovie()
        {
            return MovieRepo.findAll();
        }

        public Users getUser(String userAge) {
            Movies myMovie = new movieSelection("Horror",18,90);
            return myMovie;
        }


        public void saveUser(movieSelection users){MovieRepo.save(movieSelection);}

        public void deleteUsers(Long count) { MovieRepo.deleteById(count);
        }

        public Users findUsersByName(String name) {return MovieRepo.findUsersByName(name);
        }

        public List<Users> findMoviesByScoreRange(int score1, int score2)
        {
            return MovieRepo.findAllByScore(score1,score2);
        }


    }

}
