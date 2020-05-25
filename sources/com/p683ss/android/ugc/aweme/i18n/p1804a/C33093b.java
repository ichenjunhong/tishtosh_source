package com.p683ss.android.ugc.aweme.i18n.p1804a;

/* renamed from: com.ss.android.ugc.aweme.i18n.a.b */
public abstract class C33093b<T> {

    /* renamed from: a */
    private T f85911a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo70099a();

    /* renamed from: b */
    public final T mo70100b() {
        T t;
        synchronized (this) {
            if (this.f85911a != null) {
                t = this.f85911a;
            } else {
                t = mo70099a();
                this.f85911a = t;
            }
        }
        return t;
    }
}
