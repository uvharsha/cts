package com.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Movie;


public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // List<Movie> findAll();
    // Movie findById(int id);
    // Movie save(Movie m);
    // Movie delete(int id);
}