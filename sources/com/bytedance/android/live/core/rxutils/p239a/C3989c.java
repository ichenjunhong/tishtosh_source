package com.bytedance.android.live.core.rxutils.p239a;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.core.rxutils.p239a.p240a.C3987b;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.core.rxutils.a.c */
public final class C3989c<V> {

    /* renamed from: a */
    private final C2201v<V> f11123a;

    private C3989c(C2201v<V> vVar) {
        this.f11123a = vVar;
    }

    /* renamed from: a */
    public static <T> C3989c<T> m10100a(C2201v<T> vVar) {
        return new C3989c<>(vVar);
    }

    /* renamed from: a */
    public final <T> C1673aa<T, T> mo9394a(V v) {
        m10101a(v, "event == null");
        return new C3987b(this.f11123a, v);
    }

    /* renamed from: a */
    public static C3989c<C3988b> m10099a(C0654k kVar) {
        C3985a aVar = (C3985a) kVar.mo2224a("_LIFECYCLE_BINDING_FRAGMENT_");
        if (aVar == null) {
            aVar = new C3985a();
            C0679r a = kVar.mo2225a();
            a.mo2178a((Fragment) aVar, "_LIFECYCLE_BINDING_FRAGMENT_");
            a.mo2195c();
        } else if (aVar.isDetached()) {
            C0679r a2 = kVar.mo2225a();
            a2.mo2199e(aVar);
            a2.mo2195c();
        }
        return m10100a((C2201v<T>) aVar.f11118a);
    }

    /* renamed from: a */
    private static <T> T m10101a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
