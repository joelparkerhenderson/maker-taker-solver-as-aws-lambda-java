package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class MakerTakerPairScoreTest {

    protected Maker _maker() {
        return new Maker("maker_0", "Maker 0");
    }

    protected Taker _taker() {
        return new Taker("taker_0", "Taker 0");
    }

    protected Score _score() {
        return new Score(123, 456);
    }

    @Test
    public void newWithDefault() {
        final MakerTakerPairScore o = new MakerTakerPairScore();
        assertEquals(null, o.getMaker());
        assertEquals(null, o.getTaker());
        assertEquals(null, o.getScore());
    }

    @Test
    public void newWithParams() {
        Maker maker = _maker();
        Taker taker = _taker();
        Score score = _score();
        final MakerTakerPairScore o = new MakerTakerPairScore(maker, taker, score);
        assertEquals(maker, o.getMaker());
        assertEquals(taker, o.getTaker());
        assertEquals(score, o.getScore());
    }

}
