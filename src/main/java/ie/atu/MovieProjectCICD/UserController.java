package ie.atu.MovieProjectCICD;

import jakarta.servlet.http.HttpServletRequest;
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
@RequestMapping(path="api/user")
public class UserController {
   UserService myService;

   public UserController(UserService myService) {
        this.myService= myService;
    }

    @GetMapping
    public List<Users> myUsers() {

        return myService.getUser();
    }
    @GetMapping("/{userAge}")
    public Users getUser(@PathVariable  String userAge){


        return myService.getUser(userAge);
    }
    @PostMapping("")
    public void saveUser(@RequestBody Users user)
    {
        myService.saveUser(user);
    }



    @GetMapping("/name/{name}")
    public Users getUsersGenre(@PathVariable("genre")String genre)
    {
        return myService.findUsersByGenre(genre);
    }

    @DeleteMapping("/delete/{count}")
    public void deleteUsers(@PathVariable("count")Long count)
    {
        myService.deleteUsers(count);
    }

    @GetMapping("/age")
    public List<Users> getUsersByAgeRange(@RequestParam(name = "age_start")int age1,@RequestParam(name = "age_end")int age2 )
    {
        return myService.findUsersByAgeRange(age1,age2);
    }

    @PutMapping("")//Put will update while post will recreate the object
    public void editMovie(@RequestBody Users User)
    {
        myService.editUser(User);
    }
}
