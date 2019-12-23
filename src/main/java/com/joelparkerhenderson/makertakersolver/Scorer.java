package com.joelparkerhenderson.makertakersolver;

public class Scorer {
    
    public static Score scoreMakerTaker(
        final Maker maker, 
        final Taker taker
    ) {
        Score score = Score.ZERO;
        maker.tags.stream().forEach(makerTag -> {
            taker.tags.stream().forEach(takerTag -> {
                score.add(Scorer.scoreTags(makerTag, takerTag));
            });
        });
        return score;
    }

    public static Score scoreTags(Tag a, Tag b) {
        return (a.id == b.id) ? Score.ONE : Score.ZERO;
    }

}
