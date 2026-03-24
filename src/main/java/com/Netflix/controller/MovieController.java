package com.Netflix.controller;



import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public List<String> getMovies() {
        return Arrays.asList("KGF", "RRR", "Pushpa", "Avengers");
    }
}
