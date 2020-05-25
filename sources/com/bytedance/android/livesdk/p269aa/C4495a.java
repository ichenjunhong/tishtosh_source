package com.bytedance.android.livesdk.p269aa;

import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;

/* renamed from: com.bytedance.android.livesdk.aa.a */
public class C4495a {

    /* renamed from: b */
    private static volatile C4495a f12269b;

    /* renamed from: a */
    private final C2189f<Object> f12270a = C2180b.m6534l().mo6479n();

    private C4495a() {
    }

    /* renamed from: a */
    public static C4495a m10823a() {
        if (f12269b == null) {
            synchronized (C4495a.class) {
                if (f12269b == null) {
                    f12269b = new C4495a();
                }
            }
        }
        return f12269b;
    }

    /* renamed from: a */
    public final void mo10301a(Object obj) {
        this.f12270a.onNext(obj);
    }

    /* renamed from: a */
    public final <T> C2201v<T> mo10300a(Class<T> cls) {
        return this.f12270a.mo6524a(cls).mo6514a(C1667a.m5940a());
    }
}
