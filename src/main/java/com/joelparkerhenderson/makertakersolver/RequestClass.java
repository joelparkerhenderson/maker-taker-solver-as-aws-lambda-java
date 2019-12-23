package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class RequestClass {
    String id;
    String name;
    List<Tag> tags;
    List<Interaction> interactions;
    List<Maker> makers;
    List<Taker> takers;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(final List<Tag> tags) {
        this.tags = tags;
    }

    public List<Interaction> getInteractions() {
        return interactions;
    }

    public void setInteractions(final List<Interaction> interactions) {
        this.interactions = interactions;
    }

    public List<Maker> getMakers() {
        return makers;
    }

    public void setMakers(final List<Maker> makers) {
        this.makers = makers;
    }

    public List<Taker> getTakers() {
        return takers;
    }

    public void setTakers(final List<Taker> takers) {
        this.takers = takers;
    }

    public RequestClass(
        final String id, 
        final String name, 
        final List<Maker> makers, 
        final List<Taker> takers
    ) {
        this.id = id;
        this.name = name;
        this.makers = makers;
        this.takers = takers;
    }

    public RequestClass() {
    }
}