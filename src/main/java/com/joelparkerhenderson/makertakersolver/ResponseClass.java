package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class ResponseClass {
    String greeting;
    List<Pair> pairs;
    List<Maker> makers;
    List<Taker> takers;

    public List<Pair> getPairs() {
        return this.pairs;
    }

    public void setPairs(final List<Pair> pairs) {
        this.pairs = pairs;
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

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(final String greeting) {
        this.greeting = greeting;
    }

    public ResponseClass(
        final String greeting,
        final List<Pair> pairs,
        final List<Maker> makers, 
        final List<Taker> takers
    ) {
        this.greeting = greeting;
        this.pairs = pairs;
        this.makers = makers;
        this.takers = takers;
    }

    public ResponseClass() {
    }
}
