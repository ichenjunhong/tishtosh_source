package com.bytedance.android.live.core.rxutils;

import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.core.rxutils.p239a.C3988b;
import com.bytedance.android.live.core.rxutils.p239a.C3989c;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1712g;
import p064c.p065a.p071d.C1713h;
import p064c.p065a.p072e.p087j.C2131h;

/* renamed from: com.bytedance.android.live.core.rxutils.k */
public final class C4064k {

    /* renamed from: a */
    public static final Object f11214a = new Object();

    /* renamed from: b */
    private static C1710e<Throwable> f11215b = C4065l.f11217a;

    /* renamed from: c */
    private static C1710e<Object> f11216c = C4066m.f11218a;

    /* renamed from: b */
    public static C1710e<Throwable> m10187b() {
        return f11215b;
    }

    /* renamed from: c */
    public static C1710e<Object> m10188c() {
        return f11216c;
    }

    /* renamed from: a */
    public static <T> C4059g<T> m10182a() {
        return new C4059g<>();
    }

    /* renamed from: a */
    public static <T> C1673aa<T, T> m10180a(Fragment fragment) {
        return m10181a(fragment, C3988b.DESTROY);
    }

    /* renamed from: a */
    private static <T> C1673aa<T, T> m10181a(Fragment fragment, C3988b bVar) {
        return C3989c.m10099a(fragment.getChildFragmentManager()).mo9394a(bVar);
    }

    /* renamed from: a */
    public static <T, R> R m10184a(C1711f<T, R> fVar, T t) {
        try {
            return fVar.apply(t);
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }

    /* renamed from: a */
    public static <T, U, R> R m10183a(C1707b<T, U, R> bVar, T t, U u) {
        try {
            return bVar.mo6200a(t, u);
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> R m10185a(C1712g<T1, T2, T3, R> gVar, T1 t1, T2 t2, T3 t3) {
        try {
            return gVar.mo6205a(t1, t2, t3);
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> R m10186a(C1713h<T1, T2, T3, T4, R> hVar, T1 t1, T2 t2, T3 t3, T4 t4) {
        try {
            return hVar.mo6206a(t1, t2, t3, t4);
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }
}
