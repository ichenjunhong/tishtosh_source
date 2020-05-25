package beancopy;

/* renamed from: beancopy.a */
public final class C1662a {
    /* renamed from: a */
    public static boolean m5934a(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    /* renamed from: a */
    public static Long m5931a(Integer num, Long l) {
        return num == null ? l : Long.valueOf(num.longValue());
    }

    /* renamed from: a */
    public static String m5932a(Double d, String str) {
        return d == null ? str : String.valueOf(d.doubleValue());
    }

    /* renamed from: a */
    public static String m5933a(Long l, String str) {
        return l == null ? str : String.valueOf(l.longValue());
    }

    /* renamed from: a */
    public static boolean m5935a(Integer num, boolean z) {
        if (num == null) {
            return z;
        }
        return num.intValue() != 0;
    }

    /* renamed from: a */
    public static long m5929a(Long l) {
        return m5930a(l, 0);
    }

    /* renamed from: a */
    public static double m5922a(Double d, double d2) {
        if (d == null) {
            return d2;
        }
        return d.doubleValue();
    }

    /* renamed from: a */
    public static float m5923a(Double d, float f) {
        if (d == null) {
            return f;
        }
        return d.floatValue();
    }

    /* renamed from: a */
    public static int m5924a(Boolean bool, int i) {
        if (bool == null) {
            return i;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m5925a(Double d, int i) {
        if (d == null) {
            return i;
        }
        return d.intValue();
    }

    /* renamed from: a */
    public static int m5926a(Integer num, int i) {
        if (num == null) {
            return i;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static long m5927a(Double d, long j) {
        if (d == null) {
            return j;
        }
        return d.longValue();
    }

    /* renamed from: a */
    public static long m5928a(Integer num, long j) {
        if (num == null) {
            return j;
        }
        return num.longValue();
    }

    /* renamed from: a */
    public static long m5930a(Long l, long j) {
        if (l == null) {
            return j;
        }
        return l.longValue();
    }
}
