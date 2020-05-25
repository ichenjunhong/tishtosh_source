package com.p683ss.ugc.live.p2595a.p2596a.p2600d;

import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.C51582e;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51562b;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51564c;

/* renamed from: com.ss.ugc.live.a.a.d.e */
public final class C51580e implements C51575a<String> {

    /* renamed from: a */
    private static C51579d<String> f128836a;

    /* renamed from: b */
    private static C51579d<String> f128837b;

    /* renamed from: c */
    private C51562b f128838c = new C51564c();

    /* renamed from: a */
    private C51579d<String> m110724a(C51582e eVar) {
        return new C51576b(new C51577c(this.f128838c, eVar.f128841a));
    }

    /* renamed from: a */
    public final C51579d<String> mo13402a(C51568c cVar, C51582e eVar) {
        if (!cVar.f128821e) {
            if (f128837b != null) {
                return f128837b;
            }
            C51579d<String> a = m110724a(eVar);
            f128837b = a;
            return a;
        } else if (f128836a != null) {
            return f128836a;
        } else {
            C51581f fVar = new C51581f(m110724a(eVar));
            f128836a = fVar;
            return fVar;
        }
    }
}
