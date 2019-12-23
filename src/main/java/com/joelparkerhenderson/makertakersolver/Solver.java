package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Solver {

    public static List<Pair> solve(
        final Map<TagPair, Score> rubric,
        final List<Maker> makers, 
        final List<Taker> takers
    ) {
        final ArrayList<Pair> pairs = new ArrayList<Pair>();
        makers.stream().forEach(maker -> {
            takers.stream().forEach(taker -> {
                Score score = Scorer.byMakerTaker(rubric, maker, taker);
                Pair pair = new Pair(maker, taker, score);
                pairs.add(pair);
            });
        });
        return pairs;
    }
}