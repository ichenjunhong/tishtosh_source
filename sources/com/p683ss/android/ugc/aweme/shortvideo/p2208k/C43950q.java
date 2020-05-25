package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import android.view.KeyEvent;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.q */
final /* synthetic */ class C43950q implements C23422a {

    /* renamed from: a */
    private final C43944p f111286a;

    C43950q(C43944p pVar) {
        this.f111286a = pVar;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C43944p pVar = this.f111286a;
        if (i != 4 || !pVar.f111272f || pVar.f111274h == null) {
            return false;
        }
        pVar.f111274h.mo89515a();
        return true;
    }
}
