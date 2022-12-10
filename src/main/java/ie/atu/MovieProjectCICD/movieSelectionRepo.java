package ie.atu.MovieProjectCICD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface  movieSelectionRepo extends JpaRepository<movieSelection, Long>{

    movieSelection findMoviesByGenre(String genre);


    @Query("SELECT p FROM movieSelection p WHERE p.score > ?1 and p.score < ?2")
    public List<movieSelection> findAllByScore(int score1, int score2);
    ;
}