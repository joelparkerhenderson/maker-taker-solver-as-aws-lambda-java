package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class RequestClass {
    String id;
    String name;
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

    public List<Maker> getMakers() {
        return this.makers;
    }

    public void setMakers(final List<Maker> makers) {
        this.makers = makers;
    }

    public List<Taker> getTakers() {
        return this.takers;
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