package p2628d.p2650m;

/* renamed from: d.m.n */
public enum C52828n implements C52811f {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);
    

    /* renamed from: b */
    private final int f131080b;

    /* renamed from: c */
    private final int f131081c;

    public final int getMask() {
        return this.f131081c;
    }

    public final int getValue() {
        return this.f131080b;
    }

    private C52828n(int i, int i2) {
        this.f131080b = i;
        this.f131081c = i2;
    }
}
