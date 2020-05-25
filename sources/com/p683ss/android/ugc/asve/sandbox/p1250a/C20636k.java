package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20715s.C20716a;
import com.p683ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20818a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.k */
public final class C20636k extends C20716a {

    /* renamed from: a */
    private final WeakReference<C20818a> f56488a;

    public C20636k(C20818a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f56488a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo43768a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        if (aSSimpleFaceInfoArr != null) {
            C20818a aVar = (C20818a) this.f56488a.get();
            if (aVar != null) {
                aVar.mo43757a(aSSimpleFaceInfoArr);
            }
        }
    }
}
