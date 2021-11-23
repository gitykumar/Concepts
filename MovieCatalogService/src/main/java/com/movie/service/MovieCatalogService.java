package com.movie.service;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieCatalogService {
	
	
	@RequestMapping("/{movieId}")
	public String getService(@PathVariable String movieId) {
		
		return "Be ready for movies";
	}

}
