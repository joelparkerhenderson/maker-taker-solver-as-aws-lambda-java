package com.joelparkerhenderson.makertakersolver;

public class Interaction {
    TagPair tagPair;
    Score score;
    
    public TagPair getTagPair() {
        return tagPair;
    }

    public void setTagPair(final TagPair tagPair) {
        this.tagPair = tagPair;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(final Score score) {
        this.score = score;
    }

	public Interaction(final TagPair tagPair, final Score score) {
        this.tagPair = tagPair;
        this.score = score;
    }

    public Interaction() {
    }
}