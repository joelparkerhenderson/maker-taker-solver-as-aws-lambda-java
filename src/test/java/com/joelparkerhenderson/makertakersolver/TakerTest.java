package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TakerTest {

    @Test
    public void newWithDefault() {
        final Taker o = new Taker();
        assertEquals(null, o.getId());
        assertEquals(null, o.getName());
    }

    @Test
    public void newWithParams() {
        String id = "x";
        String name = "alice";
        final Taker o = new Taker(id, name);
        assertEquals(id, o.getId());
        assertEquals(name, o.getName());
    }

}
