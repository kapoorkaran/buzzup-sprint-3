package com.stackroute.buzzup.recommendationservice.services;

import com.stackroute.buzzup.recommendationservice.domain.Genre;

public interface GenreService {
	public Genre findByName(String genreName);

	
}
