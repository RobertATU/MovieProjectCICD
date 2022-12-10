package ie.atu.MovieProjectCICD;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public class MovieService {
    package ie.atu.MovieProjectCICD;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import java.util.List;
    @AllArgsConstructor
    @Service
    public class MovieService {
        private final MovieRepo MovieRepo;
        public List<Users> getUser()
        {
            return MovieRepo.findAll();
        }

        public Users getUser(String userAge) {
            Users myUser = new Users("Nathan", "nathan@gmail.com", "N4th4n!", 20,"Horror");
            return myUser;
        }


        public void saveUser(movieSelection users){MovieRepo.save(movieSelection);}

        public void deleteUsers(Long count) { MovieRepo.deleteById(count);
        }

        public Users findUsersByName(String name) {return MovieRepo.findUsersByName(name);
        }

        public List<Users> findUsersByAgeRange(int age1, int age2)
        {
            return MovieRepo.findAllByAge(age1,age2);
        }


    }

}
