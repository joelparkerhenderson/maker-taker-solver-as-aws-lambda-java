package com.joelparkerhenderson.makertakersolver;
import java.util.*;
import java.util.stream.*;

public class Scorer {

    public static Score byMakerTaker(
        final Map<TagPair, Score> rubric,
        final Maker maker, 
        final Taker taker
    ) {
        Score score = Score.ZERO;
        maker.tags.stream().forEach(makerTag -> {
            taker.tags.stream().forEach(takerTag -> {
                TagPair tagPair = new TagPair(makerTag, takerTag);
                if (rubric.containsKey(tagPair)) {
                    score.add(rubric.get(tagPair));
                }
            });
        });
        return score;
    }

}
