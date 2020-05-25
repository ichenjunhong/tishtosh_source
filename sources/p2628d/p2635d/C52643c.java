package p2628d.p2635d;

/* renamed from: d.d.c */
public final class C52643c {
    /* renamed from: a */
    private static final int m112186a(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        return i3 + i2;
    }

    /* renamed from: a */
    public static final int m112187a(int i, int i2, int i3) {
        return m112186a(m112186a(i, i3) - m112186a(i2, i3), i3);
    }
}
