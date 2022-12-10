package ie.atu.MovieProjectCICD;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path="api/Movies")
public class movieController {
    MovieService myService;

    public movieController(MovieService myService) {
        this.myService= myService;
    }

    @GetMapping
    public List<movieSelection> myMovies() {

        return myService.getMovie();
    }
    @GetMapping("/{userAge}")
    public Users getUser(@PathVariable  String userAge){


        return myService.getMovie(userAge);
    }
    @PostMapping("")
    public void saveUser(@RequestBody Users user)
    {
        myService.saveMovie(user);
    }

    @GetMapping("/name/{name}")
    public Users getUsersName(@PathVariable("name")String name)
    {
        return myService.findUsersByName(name);
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
}
