package com.joelparkerhenderson.makertakersolver;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TagPairTest {

    protected Tag _makerTag() {
        return new Tag("tag_0", "Tag 0");
    }

    protected Tag _takerTag() {
        return new Tag("tag_1", "Tag 1");
    }

    @Test
    public void newWithDefault() {
        final TagPair o = new TagPair();
        assertEquals(null, o.getMakerTag());
        assertEquals(null, o.getTakerTag());
    }

    @Test
    public void newWithParams() {
        Tag makerTag = _makerTag();
        Tag takerTag = _takerTag();
        final TagPair o = new TagPair(makerTag, takerTag);
        assertEquals(makerTag, o.getMakerTag());
        assertEquals(takerTag, o.getTakerTag());
    }

}

