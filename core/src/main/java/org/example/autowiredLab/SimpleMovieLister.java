package org.example.autowiredLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimpleMovieLister {
    private MovieFinder movieFinder;

    @Autowired
    @Qualifier("comedy")
    private MovieCatalog movieCatalog;

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    @Autowired
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void getMovieCatalog() {
        System.out.println(movieCatalog.getReview());
        System.out.println(movieCatalog.getType());
    }
}
