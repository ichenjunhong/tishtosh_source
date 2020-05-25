package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.link.p1573a.C25948a.C25949a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.z */
final /* synthetic */ class C25929z implements Runnable {

    /* renamed from: a */
    private final C258449 f68474a;

    C25929z(C258449 r1) {
        this.f68474a = r1;
    }

    public final void run() {
        C258449 r0 = this.f68474a;
        if (r0.f68340a > 0) {
            C25949a a = r0.mo53100e().mo53296a("display_1s");
            int i = 0;
            if (!CommerceVideoDelegate.this.mo53090w() && !CommerceVideoDelegate.this.mo53088u() && C23729p.m58267b((View) CommerceVideoDelegate.this.mLinkTag)) {
                i = 100;
            }
            C26088l.m63274a(CommerceVideoDelegate.this.f68308j, a.mo53292a(i).mo53298a());
        }
    }
}
