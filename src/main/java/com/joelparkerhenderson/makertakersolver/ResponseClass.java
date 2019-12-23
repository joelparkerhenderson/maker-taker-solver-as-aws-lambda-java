package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class ResponseClass {
    List<Maker> makers;
    List<Taker> takers;
    String greeting;

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

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(final String greeting) {
        this.greeting = greeting;
    }

    public ResponseClass(
        final List<Maker> makers, 
        final List<Taker> takers, 
        final String greeting
    ) {
        this.makers = makers;
        this.takers = takers;
        this.greeting = greeting;
    }

    public ResponseClass() {
    }
}
