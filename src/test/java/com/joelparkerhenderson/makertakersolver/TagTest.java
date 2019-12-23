package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TagTest {

    @Test
    public void newWithDefault() {
        final Tag o = new Tag();
        assertEquals(null, o.getId());
        assertEquals(null, o.getName());
    }

    @Test
    public void newWithParams() {
        String id = "x";
        String name = "alice";
        final Tag o = new Tag(id, name);
        assertEquals(id, o.getId());
        assertEquals(name, o.getName());
    }

}

