package app.model;

public class Timer {
    private long nanoTime = System.nanoTime();

    public Timer() {
        this.nanoTime = System.nanoTime();
    }

    public long getTime() {
        return nanoTime;
    }

    public void setTime(long time) {
        this.nanoTime = time;
    }
}

