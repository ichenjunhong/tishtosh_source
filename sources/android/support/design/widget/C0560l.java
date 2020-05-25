package android.support.design.widget;

/* renamed from: android.support.design.widget.l */
public final class C0560l {
    /* renamed from: a */
    public static float m1540a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: b */
    private static float m1543b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: b */
    public static boolean m1544b(float f, float f2, float f3) {
        return f + 1.0E-4f >= f2;
    }

    /* renamed from: a */
    private static float m1541a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: a */
    public static float m1542a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m1543b(m1541a(f, f2, 0.0f, 0.0f), m1541a(f, f2, f5, 0.0f), m1541a(f, f2, f5, f6), m1541a(f, f2, 0.0f, f6));
    }
}
