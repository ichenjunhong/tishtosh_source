package com.p683ss.android.ugc.aweme.poi.nearby.p2064b;

import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.feed.C30433j;
import com.p683ss.android.ugc.aweme.poi.model.C39137u;
import com.p683ss.android.ugc.aweme.poi.model.C39141y;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39041a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.b.a */
public final class C39148a extends C26851b<C39137u, C39149b> {
    /* renamed from: b */
    public final void mo44838b() {
        if (this.f70701g != null && this.f70700f != null) {
            C30433j.m71355b(true);
            ((C39149b) this.f70701g).mo79791a((C39141y) ((C39137u) this.f70700f).getData());
            if (((C39137u) this.f70700f).getData() != null) {
                C47718bf.m103288a(new C39041a(((C39141y) ((C39137u) this.f70700f).getData()).getCouponInfo()));
            }
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        if (this.f70701g != null && this.f70700f != null) {
            ((C39149b) this.f70701g).mo79792a(exc);
        }
    }
}
