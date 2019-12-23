package com.joelparkerhenderson.makertakersolver;

public class Taker {
    String id;
    String name;

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

    public Taker(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Taker() {
    }
}