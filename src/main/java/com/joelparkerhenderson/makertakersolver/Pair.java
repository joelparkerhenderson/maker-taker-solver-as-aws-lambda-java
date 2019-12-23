package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Pair {
    Maker maker;
    Taker taker;
    Score score;

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

    public Score getScore() {
        return score;
    }

    public void setScore(final Score score) {
        this.score = score;
    }

    public Pair(final Maker maker, final Taker taker, final Score score) {
        this.maker = maker;
        this.taker = taker;
        this.score = score;
    }

    public Pair() {
    }
}
