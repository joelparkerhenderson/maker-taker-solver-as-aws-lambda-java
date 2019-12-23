package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SolverTest {

    protected Tuple2<String, String> _tuple() {
        return new Tuple2<String, String>("tag_0", "tag_1");
    }

    protected Score _score() {
        return new Score(123, 456);
    }

    protected Map<Tuple2<String, String>, Score> _rubric() {
        return Map.of(_tuple(), _score());
    }

    protected Maker _maker() {
        Maker maker = new Maker("maker_0", "Maker 0");
        return maker;
    }

    protected List<Maker> _makers() {
        return new ArrayList<Maker>(Arrays.asList(_maker()));
    }

    protected Taker _taker() {
        Taker taker = new Taker("taker_0", "Taker 0");
        return taker;
    }

    protected List<Taker> _takers() {
        return new ArrayList<Taker>(Arrays.asList(_taker()));
    }

    @Test
    public void solve() {
        final Map<Tuple2<String, String>, Score> rubric = _rubric();
        final List<Maker> makers = _makers();
        final List<Taker> takers = _takers();
        final List<MakerTakerPairScore> results = Solver.solve(rubric, makers, takers);
        assertEquals(1, results.size());
        //TODO add tests
    }


}

