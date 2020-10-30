package com.assessment.movie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.movie.entity.Movie;
import com.assessment.movie.repository.MovieRepository;


@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@PostMapping("/movies")
    public Movie create(@RequestBody Movie movie)
    {
        return movieRepository.save(movie);
    }
	
	
	@GetMapping("/movies")
    public List<Movie> findAll()
    {
        return movieRepository.findAll();
    }
	
	
	@GetMapping("/movies/{id}")
    @ResponseBody
    public Movie findById(@PathVariable("id") Long id)
    {
        return movieRepository.findById(id).get();
    }
	
	
	@PutMapping("/movies/{id}")
    public Movie update(@PathVariable("id") Long id, @RequestBody Movie movieObject)
    {
		Optional<Movie> movie = movieRepository.findById(id);
		movie.get().setTitle(movieObject.getTitle());
		movie.get().setCategory(movieObject.getCategory());
		movie.get().setRating(movieObject.getRating());
        return movieRepository.save(movie.get());
    }
	
	
	@DeleteMapping("/movies/{id}")
    public List<Movie> delete(@PathVariable("id") Long id)
    {
		movieRepository.deleteById(id);
        return movieRepository.findAll();
    }	

}
