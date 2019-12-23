package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Interaction {
    String makerTagId;
    String takerTagId;
    Score score;
    
    public String getMakerTagId() {
        return makerTagId;
    }

    public void setMakerTagId(final String makerTagId) {
        this.makerTagId = makerTagId;
    }

    public String getTakerTagId() {
        return takerTagId;
    }

    public void setTakerTagId(final String takerTagId) {
        this.takerTagId = takerTagId;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(final Score score) {
        this.score = score;
    }

	public Interaction(final Tag makerTagId, final Tag takerTagId, final Score score) {
        this.makerTagId = makerTagId;
        this.takerTagId = takerTagId;
        this.score = score;
    }

    public Interaction() {
    }
}