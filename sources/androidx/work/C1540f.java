package androidx.work;

import java.util.List;

/* renamed from: androidx.work.f */
public abstract class C1540f {
    /* renamed from: a */
    public abstract C1538e mo5901a(List<C1538e> list);

    /* renamed from: a */
    public static C1540f m5498a(String str) {
        try {
            return (C1540f) Class.forName(str).newInstance();
        } catch (Exception e) {
            new StringBuilder("Trouble instantiating + ").append(str);
            new Throwable[1][0] = e;
            return null;
        }
    }
}
