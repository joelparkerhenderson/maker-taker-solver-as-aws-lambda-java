package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class InteractionTest {

    protected TagPair _tagPair() {
        return new TagPair(new Tag("tag_0", "Tag 0"), new Tag("tag_1", "Tag 1"));
    }

    protected Score _score() {
        return new Score(123, 456);
    }
    
    @Test
    public void newWithDefault() {
        final Interaction o = new Interaction();
        assertEquals(null, o.getTagPair());
        assertEquals(null, o.getScore());
    }

    @Test
    public void newWithParams() {
        TagPair tagPair = _tagPair();
        Score score = _score();
        final Interaction o = new Interaction(tagPair, score);
        assertEquals(tagPair, o.getTagPair());
        assertEquals(score, o.getScore());
    }

}

