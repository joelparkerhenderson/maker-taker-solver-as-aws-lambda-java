package com.joelparkerhenderson.makertakersolver;
import java.util.*;
import java.util.stream.*;

public class Scorer {

    public static Score byMakerTaker(
        final Map<TagPair, Score> rubric,
        final Maker maker, 
        final Taker taker
    ) {
        final Score score = new Score();
        maker.getTags().forEach(makerTag -> {
            taker.tags.stream().forEach(takerTag -> {
                System.out.println("Scorer.byMakerTaker makerTag id:" + makerTag.getId() + " takerTag id:" + takerTag.getId());
                final TagPair tagPair = new TagPair(makerTag, takerTag);
                if (rubric.containsKey(tagPair)) {
                    System.out.println("rubric!");
                    score.add(rubric.get(tagPair));
                }
            });
        });
        return score;
    }

}
