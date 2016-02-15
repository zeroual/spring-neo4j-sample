package com.zeros.web;

import com.zeros.domain.Actor;
import com.zeros.domain.ActorRepository;
import com.zeros.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Abdellah on 15/02/2016.
 */
@RestController
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    @RequestMapping(value = "/toto", method = RequestMethod.GET)
    public Actor create() {
        Actor actor = new Actor("toto");
        actor.addMovie(new Movie("foo"));
        actorRepository.save(actor);
        return actor;
    }
}
