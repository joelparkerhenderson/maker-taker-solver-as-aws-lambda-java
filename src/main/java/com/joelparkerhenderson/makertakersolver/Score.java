package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Score implements Cloneable {
    int hard = 0;
    int soft = 0;

    static final Score ZERO = new Score(0,0);
    static final Score ONE = new Score(1,1);

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

    public void add(Score score) {
        if (score == Score.ZERO) return;
        this.hard += score.hard;
        this.soft += score.soft;
    }

    public void subtract(Score score) {
        if (score == Score.ZERO) return;
        this.hard -= score.hard;
        this.soft -= score.soft;
    }

    public void multiply(Score score) {
        if (score == Score.ONE) return;
        this.hard *= score.hard;
        this.soft *= score.soft;
    }

    public void divide(Score score) {
        if (score == Score.ONE) return;
        this.hard /= score.hard;
        this.soft /= score.soft;
    }

	public Score(final int hard, final int soft) {
        this.hard = hard;
        this.soft = soft;
    }

    public Score() {
    }

}