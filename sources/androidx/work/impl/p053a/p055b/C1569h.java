package androidx.work.impl.p053a.p055b;

import android.content.Context;

/* renamed from: androidx.work.impl.a.b.h */
public final class C1569h {

    /* renamed from: e */
    private static C1569h f5569e;

    /* renamed from: a */
    public C1559a f5570a;

    /* renamed from: b */
    public C1560b f5571b;

    /* renamed from: c */
    public C1564e f5572c;

    /* renamed from: d */
    public C1568g f5573d;

    /* renamed from: a */
    public static synchronized C1569h m5566a(Context context) {
        C1569h hVar;
        synchronized (C1569h.class) {
            if (f5569e == null) {
                f5569e = new C1569h(context);
            }
            hVar = f5569e;
        }
        return hVar;
    }

    private C1569h(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5570a = new C1559a(applicationContext);
        this.f5571b = new C1560b(applicationContext);
        this.f5572c = new C1564e(applicationContext);
        this.f5573d = new C1568g(applicationContext);
    }
}
