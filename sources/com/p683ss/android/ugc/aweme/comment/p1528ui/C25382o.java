package com.p683ss.android.ugc.aweme.comment.p1528ui;

import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.o */
final /* synthetic */ class C25382o implements Runnable {

    /* renamed from: a */
    private final C25367g f67154a;

    C25382o(C25367g gVar) {
        this.f67154a = gVar;
    }

    public final void run() {
        C25367g gVar = this.f67154a;
        try {
            C25282a.m61494a().disLikeAweme(gVar.f67111c, C26428bm.m63902a(gVar.f67111c));
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }
}
