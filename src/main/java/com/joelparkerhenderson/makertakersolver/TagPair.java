package com.joelparkerhenderson.makertakersolver;

public class TagPair {
    Tag makerTag;
    Tag takerTag;

    public Tag getMakerTag() {
        return makerTag;
    }

    public void setMakerTag(final Tag makerTag) {
        this.makerTag = makerTag;
    }

    public Tag getTakerTag() {
        return takerTag;
    }

    public void setTakerTag(final Tag takerTag) {
        this.takerTag = takerTag;
    }

    public TagPair(final Tag makerTag, final Tag takerTag) {
        this.makerTag = makerTag;
        this.takerTag = takerTag;
    }

    public TagPair() {
    }
}