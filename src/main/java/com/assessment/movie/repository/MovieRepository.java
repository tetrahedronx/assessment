package com.assessment.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.movie.entity.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long>{

}
