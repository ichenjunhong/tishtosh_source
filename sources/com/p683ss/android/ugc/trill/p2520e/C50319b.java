package com.p683ss.android.ugc.trill.p2520e;

/* renamed from: com.ss.android.ugc.trill.e.b */
public abstract class C50319b<T> {

    /* renamed from: a */
    private T f126205a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo98225a();

    /* renamed from: b */
    public final T mo98226b() {
        T t;
        synchronized (this) {
            if (this.f126205a == null) {
                this.f126205a = mo98225a();
            }
            t = this.f126205a;
        }
        return t;
    }
}
