package com.demo.MovieApplication.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data

@Entity
@Table(name="movie_details")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private int movieId;

    @Column(name="movie_title")
    private String movieTitle;

    @Column(name="movie_language")
    private String movieLanguage;

    @Column(name="movie_release_date")
    private LocalDate movieReleaseDate;

    @Column(name="movie_image_url")
    private String movieImageUrl;

    public MovieEntity() {
    }

    public MovieEntity(int movieId, String movieTitle, String movieLanguage, LocalDate movieReleaseDate, String movieImageUrl) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieLanguage = movieLanguage;
        this.movieReleaseDate = movieReleaseDate;
        this.movieImageUrl = movieImageUrl;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public LocalDate getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(LocalDate movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public String getMovieImageUrl() {
        return movieImageUrl;
    }

    public void setMovieImageUrl(String movieImageUrl) {
        this.movieImageUrl = movieImageUrl;
    }
}