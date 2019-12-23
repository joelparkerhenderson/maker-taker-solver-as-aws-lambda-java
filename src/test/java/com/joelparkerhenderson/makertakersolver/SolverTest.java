package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SolverTest {

    protected TagPair _tagPair() {
        return new TagPair(new Tag("tag_0", "Tag 0"), new Tag("tag_1", "Tag 1"));
    }

    protected Score _score() {
        return new Score(123, 456);
    }

    protected Map<TagPair, Score> _rubric() {
        return Map.of(_tagPair(), _score());
    }

    protected List<Maker> _makers() {
        return new ArrayList<Maker>(Arrays.asList(new Maker("maker_0", "Maker 0")));
    }

    protected List<Taker> _takers() {
        return new ArrayList<Taker>(Arrays.asList(new Taker("taker_0", "Taker 0")));
    }

    @Test
    public void solve() {
        Map<TagPair, Score> rubric = _rubric();
        List<Maker> makers = _makers();
        List<Taker> takers = _takers();
        List<MakerTakerPairScore> results = Solver.solve(rubric, makers, takers);
        assertEquals(1, results.size());
        //TODO add tests
    }


}

