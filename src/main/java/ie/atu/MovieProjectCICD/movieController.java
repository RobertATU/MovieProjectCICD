package ie.atu.MovieProjectCICD;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path="api/movies")
public class movieController {
    MovieService myService;
    private final ie.atu.MovieProjectCICD.movieSelectionRepo movieSelectionRepo;

    public movieController(MovieService myService,
                           movieSelectionRepo movieSelectionRepo) {
        this.myService= myService;
        this.movieSelectionRepo = movieSelectionRepo;
    }

    @GetMapping
    public List<movieSelection> getMovies() {

        return myService.getMovies();
    }
    @GetMapping("/{score}")
    public movieSelection getMovie(@PathVariable  String score){


        return myService.getMovie(score);
    }
    @PostMapping("")
    public void saveMovie(@RequestBody movieSelection movie)
    {
        myService.saveMovie(movie);
    }
    @GetMapping("/genre/{genre}")
    public movieSelection getMovieGenre(@PathVariable("genre")String genre)
    {
        return myService.findMovieSelectionByGenre(genre);
    }

    @DeleteMapping("/delete/{count}")
    public void deleteMovieSelection(@PathVariable("count")Long count)
    {
        myService.deleteMovieSelection(count);
    }

    @GetMapping("/score")
    public List<movieSelection> getMoviesByScoreRange(@RequestParam(name = "score_start")int score1,@RequestParam(name = "score_end")int score2 )
    {
        return myService.findMovieSelectionByScoreRange(score1,score2);
    }
    @GetMapping("/age")
    public List<movieSelection> getMoviesByAgeRange(@RequestParam(name = "age_start")int age1,@RequestParam(name = "age_end")int age2 )
    {
        return myService.findMovieSelectionByAgeRange(age1,age2);
    }
  @PutMapping("")//Put will update while post will recreate the object
  public void editMovie(@RequestBody movieSelection movie)
  {
      myService.editMovie(movie);
  }


}
