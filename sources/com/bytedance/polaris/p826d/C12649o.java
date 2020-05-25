package com.bytedance.polaris.p826d;

/* renamed from: com.bytedance.polaris.d.o */
public abstract class C12649o<T> {

    /* renamed from: a */
    private T f33228a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo23595a();

    /* renamed from: b */
    public final T mo23740b() {
        T t;
        synchronized (this) {
            if (this.f33228a == null) {
                this.f33228a = mo23595a();
            }
            t = this.f33228a;
        }
        return t;
    }
}
