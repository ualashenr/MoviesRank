package com.ualashenr.movieranks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ualashenr.movieranks.model.Movie;
import com.ualashenr.movieranks.model.Plot;
import com.ualashenr.movieranks.model.Type;

@Service
public class MovieService {

	@Autowired
	private WebClient webClient = WebClient.create();

	public Movie rankMovie(String title, Integer year, String plotType, String type) {
		Plot.valueOf(plotType.toUpperCase());
		if (!type.equals("")) {
			Type.valueOf(type.toUpperCase());
		}
		Movie movie = webClient.get()
				.uri(uriBuild -> uriBuild.scheme("http").host("www.omdbapi.com").path("/")
						.queryParam("apikey", "de433443").queryParam("t", title).queryParam("y", year)
						.queryParam("plot", plotType).queryParam("type", type).build())
				.retrieve().bodyToMono(Movie.class).block();
		return movie;
	}

}
