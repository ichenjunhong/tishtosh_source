package com.p683ss.android.download.p1160a;

import com.bytedance.common.utility.p522b.C9378d;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.download.a.f */
final class C19089f<K, T, E, V, R> extends C19083b<K, T, E, V, R, Set<V>, C19089f<K, T, E, V, R>> {

    /* renamed from: g */
    public Set<V> f52574g = new C9378d(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo39013b() {
        return this.f52574g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39011a() {
        this.f52574g.clear();
    }

    C19089f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39012a(V v) {
        if (v != null) {
            this.f52574g.add(v);
        }
    }
}
