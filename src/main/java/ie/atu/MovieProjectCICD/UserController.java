package ie.atu.MovieProjectCICD;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@SpringBootApplication
@RequestMapping(path="api/user")
public class UserController {
   UserService myService= new UserService();

    public UserController(UserService myUser){
        this.myService = myUser;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
    }

    @GetMapping
    public List<Users> myUsers() {

        return myService.myUsers();
    }
    @GetMapping("/{userAge}")
    public Users getUser(@PathVariable  String userAge){


        return myService.getUser(userAge);
    }
}
