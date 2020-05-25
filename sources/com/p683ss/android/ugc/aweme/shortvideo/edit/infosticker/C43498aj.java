package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj */
final /* synthetic */ class C43498aj implements Runnable {

    /* renamed from: a */
    private final C435424 f109985a;

    /* renamed from: b */
    private final C43501am f109986b;

    /* renamed from: c */
    private final String f109987c;

    C43498aj(C435424 r1, C43501am amVar, String str) {
        this.f109985a = r1;
        this.f109986b = amVar;
        this.f109987c = str;
    }

    public final void run() {
        C435424 r0 = this.f109985a;
        C43501am amVar = this.f109986b;
        String str = this.f109987c;
        C43535i.this.f110137F.mo88394a();
        if (amVar != null && !TextUtils.isEmpty(str)) {
            amVar.f110003d.setPin(true);
        }
        C43535i.this.f110161d.f109932g.mo88608c(amVar);
    }
}
