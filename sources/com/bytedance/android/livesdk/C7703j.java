package com.bytedance.android.livesdk;

import android.arch.lifecycle.C0199s;
import java.util.ArrayList;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;

/* renamed from: com.bytedance.android.livesdk.j */
final /* synthetic */ class C7703j implements C0199s {

    /* renamed from: a */
    private final C6752f f21198a;

    C7703j(C6752f fVar) {
        this.f21198a = fVar;
    }

    public final void onChanged(Object obj) {
        C6752f fVar = this.f21198a;
        Map map = (Map) obj;
        if (fVar.f18466f != null && fVar.f18466f.mo13146d() != null) {
            C2201v.m6613b((Iterable<? extends T>) new ArrayList<Object>(fVar.f18466f.mo13146d())).mo6522a((C1715j<? super T>) new C7655h<Object>(map)).mo6505a((C1710e<? super T>) new C7770m<Object>(fVar), C8024n.f21959a);
            fVar.mo12877h();
        }
    }
}
