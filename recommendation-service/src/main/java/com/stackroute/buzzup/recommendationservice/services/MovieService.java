package com.stackroute.buzzup.recommendationservice.services;


import java.util.List;

import com.stackroute.buzzup.kafka.domain.MovieSchedule;
import com.stackroute.buzzup.recommendationservice.domain.Movie;



public interface MovieService {
	public void getMovieNode(MovieSchedule movie);

	public List<Movie> getGenreLanguageBasedMoviesForUser(String emailId);

	public List<Movie> getGenreBasedMoviesForUser(String emailId);

	public List<Movie> getLanguageBasedMoviesForUser(String emailId);

	public List<Movie> getTrendingMovies(); 
	
	
}
