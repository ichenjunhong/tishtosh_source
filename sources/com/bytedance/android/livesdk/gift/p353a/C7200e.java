package com.bytedance.android.livesdk.gift.p353a;

import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.C51582e;
import com.p683ss.ugc.live.p2595a.p2596a.p2597a.C51559b;
import com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51575a;
import com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51576b;
import com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51579d;
import com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51581f;

/* renamed from: com.bytedance.android.livesdk.gift.a.e */
public final class C7200e implements C51575a<String> {

    /* renamed from: a */
    private static C51579d<String> f19566a;

    /* renamed from: b */
    private static C51579d<String> f19567b;

    /* renamed from: a */
    private static C51579d<String> m14944a(C51559b bVar) {
        return new C51576b(new C7198d(bVar));
    }

    /* renamed from: a */
    public final C51579d<String> mo13402a(C51568c cVar, C51582e eVar) {
        if (!cVar.f128821e) {
            if (f19567b != null) {
                return f19567b;
            }
            C51579d<String> a = m14944a(eVar.f128841a);
            f19567b = a;
            return a;
        } else if (f19566a != null) {
            return f19566a;
        } else {
            C51581f fVar = new C51581f(m14944a(eVar.f128841a));
            f19566a = fVar;
            return fVar;
        }
    }
}
