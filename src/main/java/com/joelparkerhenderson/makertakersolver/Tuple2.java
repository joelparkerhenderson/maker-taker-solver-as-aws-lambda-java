package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Tuple2<I0, I1> {
    final I0 i0;
    final I1 i1;

    public I0 getI0() {
        return i0;
    }

    public I1 getI1() {
        return i1;
    }

    public Tuple2(final I0 i0, final I1 i1) {
        this.i0 = i0;
        this.i1 = i1;
    }
}
