package com.bytedance.ies.bullet.p628b.p637g.p638a;

import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ies.bullet.b.g.a.d */
public final class C10328d<T> implements C10327c<T> {

    /* renamed from: a */
    private WeakReference<T> f27738a;

    /* renamed from: a */
    public final void mo18295a() {
        WeakReference<T> weakReference = this.f27738a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27738a = null;
    }

    /* renamed from: b */
    public final T mo18392b() {
        WeakReference<T> weakReference = this.f27738a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C10328d(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f27738a = weakReference;
    }
}
