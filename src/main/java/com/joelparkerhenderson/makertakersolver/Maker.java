package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Maker {
    String id;
    String name;
    List<Tag> tags;
    List<String> tagIds; // input serialization

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(final List<Tag> tags) {
        this.tags = tags;
    }

    public void setTagIds(final List<String> tagIds) {
        this.tagIds = tagIds;
    }

	public Maker(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Maker() {
    }
}