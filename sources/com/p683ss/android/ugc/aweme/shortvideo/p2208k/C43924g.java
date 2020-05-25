package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.g */
final /* synthetic */ class C43924g implements Callable {

    /* renamed from: a */
    static final Callable f111222a = new C43924g();

    private C43924g() {
    }

    public final Object call() {
        IFoundationAVService iFoundationAVService;
        Object a = C27991b.m66756a(IFoundationAVService.class);
        if (a != null) {
            iFoundationAVService = (IFoundationAVService) a;
        } else {
            iFoundationAVService = (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        iFoundationAVService.tryCopyDuetDefaultLayout();
        return null;
    }
}
