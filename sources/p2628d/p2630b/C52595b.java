package p2628d.p2630b;

/* renamed from: d.b.b */
public class C52595b {
    /* renamed from: a */
    public static final <T extends Comparable<?>> int m112153a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
