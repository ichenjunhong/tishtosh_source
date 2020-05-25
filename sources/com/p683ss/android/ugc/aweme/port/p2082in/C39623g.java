package com.p683ss.android.ugc.aweme.port.p2082in;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.effectmanager.C48691e;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;

/* renamed from: com.ss.android.ugc.aweme.port.in.g */
final /* synthetic */ class C39623g implements C48691e {

    /* renamed from: a */
    static final C48691e f101191a = new C39623g();

    private C39623g() {
    }

    /* renamed from: a */
    public final void mo80693a(String str) {
        IFoundationAVService iFoundationAVService;
        Object a = C27991b.m66756a(IFoundationAVService.class);
        if (a != null) {
            iFoundationAVService = (IFoundationAVService) a;
        } else {
            iFoundationAVService = (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        iFoundationAVService.loadLibrary(str, C39618d.f101160a);
    }
}
