package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class Tuple2Test {

    @Test
    public void newWithParams() {
        String i0 = "i0"
        String i1 = "i1"
        final Tuple2<String, String> o = new Tuple2(i0, i1);
        assertEquals(i0, o.getI0());
        assertEquals(i1, o.getI1());
    }

}

