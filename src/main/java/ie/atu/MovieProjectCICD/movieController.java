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
    @GetMapping("/{movieScore}")
    public Users getUser(@PathVariable  String movieGenre){


        return myService.getMovie(MovieGenre());
    }
    @PostMapping("")
    public void saveUser(@RequestBody movieSelection movie)
    {
        myService.saveMovie(movie);
    }

    @GetMapping("/genre/{genre}")
    public Users getMovieGenre(@PathVariable("genre")String name)
    {
        return myService.findMoviesByGenre(genre);
    }

    @DeleteMapping("/delete/{count}")
    public void deleteUsers(@PathVariable("count")Long count)
    {
        myService.deleteUsers(count);
    }

    @GetMapping("/score")
    public List<Users> getMoviesByScoreRange(@RequestParam(name = "score_start")int score1,@RequestParam(name = "score_end")int score2 )
    {
        return myService.findUsersByScoreRange(score1,score2);
    }
}
