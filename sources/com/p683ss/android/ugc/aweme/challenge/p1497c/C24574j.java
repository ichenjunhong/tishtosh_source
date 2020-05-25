package com.p683ss.android.ugc.aweme.challenge.p1497c;

import com.p683ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.j */
public final class C24574j extends C26851b<C24570i, C24578n> {
    /* renamed from: R_ */
    public final void mo44834R_() {
        if (this.f70701g != null) {
            ((C24578n) this.f70701g).mo50344a();
        }
    }

    /* renamed from: b */
    public final void mo44838b() {
        super.mo44838b();
        if (this.f70701g != null && this.f70700f != null) {
            C24578n nVar = (C24578n) this.f70701g;
            C26832a aVar = this.f70700f;
            C52711k.m112236a((Object) aVar, "mModel");
            SearchSugChallengeList searchSugChallengeList = (SearchSugChallengeList) ((C24570i) aVar).getData();
            C52711k.m112236a((Object) searchSugChallengeList, "mModel.data");
            nVar.mo50345a(searchSugChallengeList);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C24578n) this.f70701g).mo50346a(exc);
        }
    }
}
