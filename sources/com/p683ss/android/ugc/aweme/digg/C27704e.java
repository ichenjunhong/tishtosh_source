package com.p683ss.android.ugc.aweme.digg;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26865e;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.digg.p1633a.C27686a;
import com.p683ss.android.ugc.vcd.C50503c;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.digg.e */
public final class C27704e extends C26876b<C27702d> {
    /* renamed from: b */
    public final void mo44838b() {
        C27686a aVar;
        C27702d dVar = (C27702d) this.f70700f;
        if (dVar != null) {
            aVar = (C27686a) dVar.getData();
        } else {
            aVar = null;
        }
        if (aVar != null && (this.f70701g instanceof C50503c)) {
            C26865e eVar = this.f70701g;
            if (eVar != null) {
                C50503c cVar = (C50503c) eVar;
                C26832a aVar2 = this.f70700f;
                C52711k.m112236a((Object) aVar2, "mModel");
                boolean z = ((C27686a) ((C27702d) aVar2).getData()).f72674a;
                C26832a aVar3 = this.f70700f;
                C52711k.m112236a((Object) aVar3, "mModel");
                int i = ((C27686a) ((C27702d) aVar3).getData()).f72679f;
                C26832a aVar4 = this.f70700f;
                C52711k.m112236a((Object) aVar4, "mModel");
                cVar.mo51917a(z, i, ((C27686a) ((C27702d) aVar4).getData()).f72680g);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.vcd.IVcdFilteredView");
            }
        }
        super.mo44838b();
    }
}
