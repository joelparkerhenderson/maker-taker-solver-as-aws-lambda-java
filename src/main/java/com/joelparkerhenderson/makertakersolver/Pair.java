package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Pair {
    Score score;
    Maker maker;
    Taker taker;

    public Score getScore() {
        return score;
    }

    public void setScore(final Score score) {
        this.score = score;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(final Maker maker) {
        this.maker = maker;
    }

    public Taker getTaker() {
        return taker;
    }

    public void setTaker(final Taker taker) {
        this.taker = taker;
    }

    public Pair(final Score score, final Maker maker, final Taker taker) {
        this.score = score;
        this.maker = maker;
        this.taker = taker;
    }

    public Pair() {
    }
}
