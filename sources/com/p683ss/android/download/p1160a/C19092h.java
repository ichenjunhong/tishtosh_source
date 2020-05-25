package com.p683ss.android.download.p1160a;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.download.a.h */
final class C19092h<K, T, E, V, R> extends C19083b<K, T, E, V, R, V, C19092h<K, T, E, V, R>> {

    /* renamed from: g */
    WeakReference<V> f52577g;

    C19092h() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39011a() {
        this.f52577g = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final V mo39013b() {
        if (this.f52577g != null) {
            return this.f52577g.get();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39012a(V v) {
        if (v != null) {
            this.f52577g = new WeakReference<>(v);
        } else {
            this.f52577g = null;
        }
    }
}
