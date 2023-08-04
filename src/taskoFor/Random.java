package taskoFor;

import java.util.concurrent.atomic.AtomicLong;

public class Random {
    private long a, c, m;
    private AtomicLong x;

    public Random() {
        this.a = 25214903917l;
        this.m = 2 ^ 48;
    }

    public Random whtSeed(long c) {
        this.c = c;
        x = new AtomicLong(c);
        return this;
    }

    public int next() {
        return (int) (1 * (a * x.getAndIncrement() + c) % m);
    }
}
