package ie.atu.MovieProjectCICD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface  UsersRepo extends JpaRepository<movieSelection, Long>{

    movieSelection findMoviesByTitle(String title);

    @Query("SELECT p FROM moveSelection p WHERE p.score > ?1 and p.score < ?2")
    public List<movieSelection> findAllByScore(int score1, int score2);
}