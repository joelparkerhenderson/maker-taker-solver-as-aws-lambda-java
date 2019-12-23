package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Score {
    int hard;
    int soft;

    public int getHard() {
        return hard;
    }

    public void setHard(final int hard) {
        this.hard = hard;
    }

    public int getSoft() {
        return soft;
    }

    public void setSoft(final int soft) {
        this.soft = soft;
    }

	public Score(final int hard, final int soft) {
        this.hard = hard;
        this.soft = soft;
    }

    public Score() {
    }
}