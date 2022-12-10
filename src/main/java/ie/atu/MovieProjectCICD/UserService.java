package ie.atu.MovieProjectCICD;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@AllArgsConstructor
@Service
public class UserService {
    private final UsersRepo UsersRepo;
    public List<Users> getUser()
    {
        return UsersRepo.findAll();
    }

    public Users getUser(String userAge) {
        Users myUser = new Users("Nathan", "abc@gmail.com", "N4th4n!", 20,"Horror");
        return myUser;
    }


    public void saveUser(Users users){UsersRepo.save(users);}

    public void deleteUsers(Long count) { UsersRepo.deleteById(count);
    }

    public Users findUsersByName(String name) {return UsersRepo.findUsersByName(name);
    }

    public List<Users> findUsersByAgeRange(int age1, int age2)
    {
        return UsersRepo.findAllByAge(age1,age2);
    }


    public void editUser(Users user) {UsersRepo.save(user);}

}
