package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Solver {

    public static List<MakerTakerPairScore> solve(
        final Map<TagPair, Score> rubric,
        final List<Maker> makers, 
        final List<Taker> takers
    ) {
        final ArrayList<MakerTakerPairScore> pairs = new ArrayList<MakerTakerPairScore>();
        makers.stream().forEach(maker -> {
            takers.stream().forEach(taker -> {
                Score score = Scorer.byMakerTaker(rubric, maker, taker);
                MakerTakerPairScore pair = new MakerTakerPairScore(maker, taker, score);
                pairs.add(pair);
            });
        });
        return pairs;
    }
}