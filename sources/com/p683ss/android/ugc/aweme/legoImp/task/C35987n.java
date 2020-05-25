package com.p683ss.android.ugc.aweme.legoImp.task;

import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9598h;
import com.p683ss.android.ugc.aweme.services.performance.ICrashReportService;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.n */
final /* synthetic */ class C35987n implements C9598h {

    /* renamed from: a */
    private final ICrashReportService f92217a;

    C35987n(ICrashReportService iCrashReportService) {
        this.f92217a = iCrashReportService;
    }

    /* renamed from: a */
    public final void mo17349a(C9571d dVar, String str, Thread thread) {
        this.f92217a.report(2);
    }
}
