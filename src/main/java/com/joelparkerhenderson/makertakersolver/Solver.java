package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Solver {

    public List<Pair> solve(
        final List<Maker> makers, 
        final List<Taker> takers
    ) {
        ArrayList<Pair> pairs = new ArrayList<Pair>();
        while (!makers.isEmpty() && !takers.isEmpty()) {
            Score score = new Score(0,0);
            Maker maker = makers.remove(0);
            Taker taker = takers.remove(0);
            Pair pair = new Pair(score, maker, taker);
            pairs.add(pair);
        }
        return pairs;
    }

    public Solver() {
    }
}