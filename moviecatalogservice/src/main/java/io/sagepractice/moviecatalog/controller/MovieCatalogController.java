package io.sagepractice.moviecatalog.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import io.sagepractice.moviecatalog.model.CatalogItem;
import io.sagepractice.moviecatalog.model.Movie;
import io.sagepractice.moviecatalog.model.Rating;
@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	@Autowired
	RestTemplate restTemplate;
	/*
	 * Movie movie=restTemplate.getForObject("localhost:8082/movies/3",
	 * Movie.class);
	 */
	
	
	  @RequestMapping("/{userId}")
	    public List<CatalogItem> getCatalog(@PathVariable String  userId) {
	        List<Rating>  ratingList = Arrays.asList(
	                new Rating("123",4),new Rating("5678", 3));
	        
	        return ratingList.stream()
	                .map(rating -> {
	                    Movie movie = restTemplate.getForObject("http://localhost:8088/movie/3", Movie.class);
	                    return new CatalogItem(movie.getName(),"aliens description",4);
	                })
	                .collect(Collectors.toList());
	        
	        
			/*
			 * return ratingList.stream().map(rating -> Movie
			 * movie=restTemplate.getForObject("localhost:8082/movies/3", Movie.class); new
			 * CatalogItem("spiderman","test",4)) .collect(Collectors.toList()); //+
			 * rating.gatMovieId()
			 */	 
//	        return Collections.singletonList(new CatalogItem("spiderman","test",4));
	    }

	/*
	 * @RequestMapping("/{userId}") public List<MovieCatalogItem>
	 * getCatalog(@PathVariable String userId){ return Collections.singletonList(new
	 * MovieCatalogItem("Avengers","test",3)); }
	 */
}
