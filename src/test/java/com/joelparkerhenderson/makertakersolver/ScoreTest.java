package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class ScoreTest {

    @Test
    public void newWithDefault() {
        final Score o = new Score();
        assertEquals(0, o.getHard());
        assertEquals(0, o.getSoft());
    }

    @Test
    public void newWithParams() {
        int hard = 123;
        int soft = 456;
        final Score o = new Score(hard, soft);
        assertEquals(hard, o.getHard());
        assertEquals(soft, o.getSoft());
    }

}

