package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Pair {
    Maker maker;
    Taker taker;

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

    public Pair(final Maker maker, final Taker taker) {
        this.maker = maker;
        this.taker = taker;
    }

    public Pair() {
    }
}
