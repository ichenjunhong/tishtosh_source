package p2628d.p2650m;

/* renamed from: d.m.c */
class C52807c extends C52806b {
    /* renamed from: a */
    public static final boolean m112365a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        if (Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2)) {
            return true;
        }
        return false;
    }
}
