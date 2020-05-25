package com.bytedance.android.live.core.rxutils;

import org.p2692b.C53694b;
import p064c.p065a.C1675ac;
import p064c.p065a.C1680ad;
import p064c.p065a.C1685ai;
import p064c.p065a.C2149h;
import p064c.p065a.C2193n;
import p064c.p065a.C2198s;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p080c.C1873h;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.core.rxutils.g */
public final class C4059g<T> implements C4056e<T> {
    /* renamed from: a */
    public final C1685ai<T> mo6172a(C1680ad<T> adVar) {
        return adVar.mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a());
    }

    /* renamed from: a */
    public final C2198s<T> mo6499a(C2193n<T> nVar) {
        C2193n a = nVar.mo6484a(C2168a.m6521b());
        C1675ac a2 = C1667a.m5940a();
        C1745b.m6050a(a2, "scheduler is null");
        return C2150a.m6484a((C2193n<T>) new C1873h<T>(a, a2));
    }

    /* renamed from: a */
    public final C2206z<T> mo6134a(C2201v<T> vVar) {
        return vVar.mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
    }

    /* renamed from: a */
    public final C53694b<T> mo6480a(C2149h<T> hVar) {
        return hVar.mo6452b(C2168a.m6521b()).mo6443a(C1667a.m5940a());
    }
}
