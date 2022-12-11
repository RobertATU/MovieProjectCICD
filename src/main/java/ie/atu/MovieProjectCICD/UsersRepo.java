package ie.atu.MovieProjectCICD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface  UsersRepo extends JpaRepository<Users, Long>{

    Users findUsersByGenre(String genre);

    @Query("SELECT p FROM Users p WHERE p.age > ?1 and p.age < ?2")
    public List<Users> findAllByAge(int age1, int age2);


}
