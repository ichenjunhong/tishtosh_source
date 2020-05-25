package com.p683ss.android.ugc.aweme.commercialize.feed;

import com.p683ss.android.ugc.aweme.commercialize.p1553d.p1554a.C25709a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.v */
final /* synthetic */ class C25925v implements Runnable {

    /* renamed from: a */
    private final CommerceVideoDelegate f68468a;

    /* renamed from: b */
    private final boolean f68469b;

    /* renamed from: c */
    private final boolean f68470c;

    C25925v(CommerceVideoDelegate commerceVideoDelegate, boolean z, boolean z2) {
        this.f68468a = commerceVideoDelegate;
        this.f68469b = z;
        this.f68470c = z2;
    }

    public final void run() {
        CommerceVideoDelegate commerceVideoDelegate = this.f68468a;
        boolean z = this.f68469b;
        boolean z2 = this.f68470c;
        commerceVideoDelegate.feedAdLayout.setVisibility(8);
        if (z) {
            if (!C48121w.m104087I()) {
                C48121w.m104249M().mo95291x();
            } else {
                C50158g a = CommerceVideoDelegate.m62502a(commerceVideoDelegate.f68305g);
                if (a != null) {
                    a.mo60214ae();
                }
            }
            if (commerceVideoDelegate.f68310l != null && z2) {
                commerceVideoDelegate.f68310l.mo53239a(2, commerceVideoDelegate.f68300b + 1);
            }
            C47718bf.m103288a(new C25709a(false, commerceVideoDelegate.f68301c.getAid()));
        }
    }
}
