package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Solver {

    public List<Pair> solve(
        final List<Maker> makers, 
        final List<Taker> takers
    ) {
        final ArrayList<Pair> pairs = new ArrayList<Pair>();
        makers.stream().forEach(maker -> {
            takers.stream().forEach(taker -> {
                Score score = Scorer.scoreMakerTaker(maker, taker);
                Pair pair = new Pair(maker, taker, score);
                pairs.add(pair);
            });
        });
        return pairs;
    }

    public Solver() {
    }
}