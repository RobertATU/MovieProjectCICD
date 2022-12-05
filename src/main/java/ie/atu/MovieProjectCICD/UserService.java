package ie.atu.MovieProjectCICD;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UserService {
    public List<Users> myUsers() {
        List<Users> myUsers = List.of(
                new Users("Nathan", "nathan@gmail.com", "N4th4n!", 21),
                new Users("Nathan", "nathan@gmail.com", "N4th4n!", 41),
                new Users("Nathan", "nathan@gmail.com", "N4th4n!", 51));
        return myUsers;
    }

    public Users getUser(String userAge) {
        Users myUser = new Users("Nathan", "nathan@gmail.com", "N4th4n!", 81);
        return myUser;
    }

}
