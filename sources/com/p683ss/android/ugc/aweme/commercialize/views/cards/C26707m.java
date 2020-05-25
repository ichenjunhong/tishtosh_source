package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.m */
final /* synthetic */ class C26707m implements Runnable {

    /* renamed from: a */
    private final C266954 f70380a;

    C26707m(C266954 r1) {
        this.f70380a = r1;
    }

    public final void run() {
        C266954 r0 = this.f70380a;
        if (C26691e.this.f70343d.f69955a) {
            if (!C48121w.m104087I()) {
                C48121w.m104249M().mo95293z();
                return;
            }
            C50158g a = C26691e.m64553a(C26691e.this.f70353n);
            if (a != null) {
                a.mo60215af();
                return;
            }
            C50130a.m108170a().mo60215af();
        }
    }
}
