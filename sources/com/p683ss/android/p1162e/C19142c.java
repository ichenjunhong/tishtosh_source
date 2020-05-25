package com.p683ss.android.p1162e;

/* renamed from: com.ss.android.e.c */
public abstract class C19142c<T> {

    /* renamed from: a */
    private volatile T f52742a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo22768a();

    /* renamed from: b */
    public final T mo39084b() {
        if (this.f52742a == null) {
            synchronized (this) {
                if (this.f52742a == null) {
                    this.f52742a = mo22768a();
                }
            }
        }
        return this.f52742a;
    }
}
