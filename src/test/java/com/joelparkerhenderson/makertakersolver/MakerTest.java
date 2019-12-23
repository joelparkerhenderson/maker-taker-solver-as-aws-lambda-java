package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class MakerTest {

    @Test
    public void newWithDefault() {
        final Maker o = new Maker();
        assertEquals(null, o.getId());
        assertEquals(null, o.getName());
    }

    @Test
    public void newWithParams() {
        String id = "x";
        String name = "alice";
        final Maker o = new Maker(id, name);
        assertEquals(id, o.getId());
        assertEquals(name, o.getName());
    }

}

