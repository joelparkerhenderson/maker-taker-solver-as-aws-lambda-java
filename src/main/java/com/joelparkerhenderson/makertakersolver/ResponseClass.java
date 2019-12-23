package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class ResponseClass {
    String greeting;
    List<Pair> pairs;
    List<Tag> tags;
    List<Interaction> interactions;
    List<Maker> makers;
    List<Taker> takers;

    public List<Pair> getPairs() {
        return pairs;
    }

    public void setPairs(final List<Pair> pairs) {
        this.pairs = pairs;
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
