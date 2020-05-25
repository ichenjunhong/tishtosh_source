package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import com.p683ss.android.ugc.aweme.video.C48121w;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.d */
final /* synthetic */ class C33110d implements Runnable {

    /* renamed from: a */
    private final C33107a f85942a;

    C33110d(C33107a aVar) {
        this.f85942a = aVar;
    }

    public final void run() {
        C33107a aVar = this.f85942a;
        if (aVar.isShowing()) {
            if (C48121w.m104249M().mo95257o()) {
                C48121w.m104249M().mo95293z();
                aVar.f85938b = true;
                return;
            }
            aVar.mo70136a();
        }
    }
}
