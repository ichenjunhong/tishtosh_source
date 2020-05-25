package dagger.p2651a;

import java.util.LinkedHashMap;

/* renamed from: dagger.a.a */
public final class C52864a {
    /* renamed from: b */
    private static int m112467b(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static <K, V> LinkedHashMap<K, V> m112466a(int i) {
        return new LinkedHashMap<>(m112467b(i));
    }
}
