package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.p1103ad.p1104a.C18511a;
import com.p683ss.android.p1103ad.p1104a.C18511a.C18513a;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18516b;
import com.p683ss.android.ugc.aweme.account.C20854a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bt */
final /* synthetic */ class C26440bt implements C18516b {

    /* renamed from: a */
    static final C18516b f69704a = new C26440bt();

    private C26440bt() {
    }

    /* renamed from: a */
    public final C18511a mo37780a() {
        C18513a aVar = new C18513a();
        aVar.f51030g = String.valueOf(AppLog.getAppId());
        aVar.f51028e = C11010c.m22288i();
        aVar.f51024a = AppLog.getServerDeviceId();
        aVar.f51027d = C20854a.m53167g().getCurUser().getShortId();
        aVar.f51029f = String.valueOf(C11010c.m22287h());
        return new C18511a(aVar);
    }
}
