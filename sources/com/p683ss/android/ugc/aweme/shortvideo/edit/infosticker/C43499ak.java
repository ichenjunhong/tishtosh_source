package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ak */
final /* synthetic */ class C43499ak implements Runnable {

    /* renamed from: a */
    private final C435424 f109988a;

    /* renamed from: b */
    private final boolean f109989b;

    C43499ak(C435424 r1, boolean z) {
        this.f109988a = r1;
        this.f109989b = z;
    }

    public final void run() {
        C435424 r0 = this.f109988a;
        boolean z = this.f109989b;
        C43535i.this.f110137F.mo88394a();
        C43535i.this.mo88650c(true);
        C43535i.this.mo88659h();
        C43535i.this.f110161d.invalidate();
        if (z) {
            C10691a.m21543b(C43535i.this.f110165h.getContext(), (int) R.string.ayw, 0).mo19066a();
        }
    }
}
