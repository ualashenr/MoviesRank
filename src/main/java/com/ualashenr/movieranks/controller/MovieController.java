package com.ualashenr.movieranks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ualashenr.movieranks.model.Movie;
import com.ualashenr.movieranks.service.MovieService;

@RestController
@RequestMapping(value = "/search")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping(value = "/movie")
	public ResponseEntity<Movie> rankMovie(@RequestParam(name = "title", defaultValue = "") String title,
			@RequestParam(name = "year", defaultValue = "") Integer year,
			@RequestParam(name = "plot", defaultValue = "short") String plotType,
			@RequestParam(name = "type", defaultValue = "") String type) {
		return ResponseEntity.ok().body(movieService.rankMovie(title, year, plotType, type));
	}

}
