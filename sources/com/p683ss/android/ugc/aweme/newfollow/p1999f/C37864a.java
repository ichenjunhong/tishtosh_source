package com.p683ss.android.ugc.aweme.newfollow.p1999f;

import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31761a;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37861d;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37918d;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.newfollow.f.a */
public class C37864a extends C26851b<C37861d, C37918d> {
    /* renamed from: b */
    public final void mo44838b() {
        super.mo44838b();
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
    }

    @C53771m
    public void onDeleteItemEvent(C31761a aVar) {
        if (this.f70701g != null && ((C37918d) this.f70701g).isViewValid() && aVar.f82954a == 3) {
            mo44934a_(aVar.f82956c);
        }
    }
}
