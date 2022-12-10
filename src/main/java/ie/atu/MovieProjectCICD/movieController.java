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
    @GetMapping("/{movieGenre}")
    public movieSelection getmovieSelection(@PathVariable  String movieGenre){


        return myService.getMovieSelection(movieGenre);
    }
    @PostMapping("")
    public void savemovieSelection(@RequestBody movieSelection movie)
    {
        myService.saveMovieSelection(movie);
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
}
