package com.zeros.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class Actor {

    @GraphId
    private Long id;

    @Property(name = "name")
    private String fullName;
    @Relationship(type = "ACTED_IN", direction = Relationship.OUTGOING)
    private List<Movie> filmography = new ArrayList<>();

    public Actor(String fullName) {
        this.fullName = fullName;
    }

    public void addMovie(Movie movie) {
        filmography.add(movie);
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Movie> getFilmography() {
        return filmography;
    }
}