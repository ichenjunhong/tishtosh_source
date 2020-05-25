package p2628d.p2643g;

/* renamed from: d.g.c */
public class C52735c extends C52734b {
    /* renamed from: b */
    public static final long m112279b(float f) {
        return C52733a.m112278a((double) f);
    }

    /* renamed from: a */
    public static final int m112277a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: a */
    public static final long m112278a(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
