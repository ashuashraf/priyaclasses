package io.sagepractice2.ratingcatalogs.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sagepractice2.ratingcatalogs.model.Rating;

@RestController
@RequestMapping("/rating")
public class RatingCatalogs {
	
	@RequestMapping("/{userId}")
	public Rating getRating(@PathVariable String userId) {
		return new Rating(userId,"5");
		
	}

}
