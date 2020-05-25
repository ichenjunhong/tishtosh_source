package com.p683ss.android.ugc.aweme.i18n.language.p1805a;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.e */
public abstract class C33105e<T> {

    /* renamed from: a */
    private T f85936a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo70134a();

    /* renamed from: b */
    public final T mo70135b() {
        T t;
        synchronized (this) {
            if (this.f85936a == null) {
                this.f85936a = mo70134a();
            }
            t = this.f85936a;
        }
        return t;
    }
}
