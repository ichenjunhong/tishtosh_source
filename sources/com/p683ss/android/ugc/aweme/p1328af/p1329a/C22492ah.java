package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.af.a.ah */
public final class C22492ah<T> implements C22523m<T> {

    /* renamed from: a */
    private WeakReference<T> f60605a;

    /* renamed from: a */
    public final T mo46830a() {
        WeakReference<T> weakReference = this.f60605a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo46831b() {
        WeakReference<T> weakReference = this.f60605a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f60605a = null;
    }

    public C22492ah(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f60605a = weakReference;
    }
}
