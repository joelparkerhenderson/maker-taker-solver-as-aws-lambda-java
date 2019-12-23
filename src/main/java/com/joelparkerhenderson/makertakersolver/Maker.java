package com.joelparkerhenderson.makertakersolver;

public class Maker {
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

    public Maker(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Maker() {
    }
}