package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.graphics.Color;
import android.support.p030v4.content.C0726c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25592b;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.p1554a.C25709a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.u */
final /* synthetic */ class C25924u implements Runnable {

    /* renamed from: a */
    private final CommerceVideoDelegate f68466a;

    /* renamed from: b */
    private final C50158g f68467b;

    C25924u(CommerceVideoDelegate commerceVideoDelegate, C50158g gVar) {
        this.f68466a = commerceVideoDelegate;
        this.f68467b = gVar;
    }

    public final void run() {
        CommerceVideoDelegate commerceVideoDelegate = this.f68466a;
        C50158g gVar = this.f68467b;
        commerceVideoDelegate.f68304f.setVisibility(4);
        if (!C48121w.m104087I()) {
            C48121w.m104249M().mo95293z();
        } else if (gVar != null) {
            gVar.mo60215af();
        }
        C25884ap.f68414a.mo53205a("showAdLayout", commerceVideoDelegate.f68301c);
        commerceVideoDelegate.feedAdLayout.setVisibility(0);
        C47795d.m103429a(commerceVideoDelegate.feedAdDownloadBtn);
        C25592b bVar = new C25592b((float) C23728o.m58241a(2.0d), commerceVideoDelegate.f68308j.getResources().getColor(R.color.ss));
        if (C26512f.m64079v(commerceVideoDelegate.f68301c)) {
            C47795d.m103431a(commerceVideoDelegate.feedAdDownloadBtn, bVar, C0726c.m2098c(commerceVideoDelegate.f68308j, R.color.a1x), Color.parseColor(C26512f.m64078u(commerceVideoDelegate.f68301c)), 300);
        } else {
            commerceVideoDelegate.feedAdDownloadBtn.setBackground(bVar);
        }
        commerceVideoDelegate.feedAdLayout.animate().alpha(1.0f).setDuration(150).start();
        C47718bf.m103288a(new C25709a(true, commerceVideoDelegate.f68301c.getAid()));
    }
}
