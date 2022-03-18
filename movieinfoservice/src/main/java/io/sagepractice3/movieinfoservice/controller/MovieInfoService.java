package io.sagepractice3.movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sagepractice3.movieinfoservice.model.Movie;
@RestController
@RequestMapping("/movie")
public class MovieInfoService {
	@RequestMapping("/{movieId}")
	public Movie  getMovieInfo(@PathVariable String movieId) {
		return new Movie(movieId,"spidermovie");
		
	}

}
