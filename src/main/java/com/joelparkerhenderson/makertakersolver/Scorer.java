package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Scorer {

    public static Score byMakerTaker(
        final Map<Tuple2<String, String>, Score> rubric,
        final Maker maker, 
        final Taker taker
    ) {
        final Score score = new Score();
        maker.getTags().forEach(makerTag -> {
            taker.tags.stream().forEach(takerTag -> {
                System.out.println("Scorer.byMakerTaker makerTag id:" + makerTag.getId() + " takerTag id:" + takerTag.getId());
                final Tuple2<String, String> tuple = new Tuple2(makerTag.getId(), takerTag.getId());
                if (rubric.containsKey(tuple)) {
                    System.out.println("rubric!");
                    score.add(rubric.get(tuple));
                }
            });
        });
        return score;
    }

}
