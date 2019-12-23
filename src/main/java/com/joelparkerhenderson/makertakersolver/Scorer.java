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
                final String makerTagId = makerTag.getId();
                final String takerTagId = takerTag.getId();
                System.out.println("Scorer.byMakerTaker makerTag id:" + makerTagId + " takerTag id:" + takerTagId);
                final Tuple2<String, String> tuple = new Tuple2<String, String>(makerTagId, takerTagId);                
                if (rubric.containsKey(tuple)) {
                    System.out.println("rubric!");
                    Score s = rubric.get(tuple);
                    score.add(s);
                }
            });
        });
        return score;
    }

}
