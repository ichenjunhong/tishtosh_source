package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;

/* renamed from: com.ss.android.ugc.aweme.notification.a.g */
final /* synthetic */ class C38124g implements AsyncServiceLoader {

    /* renamed from: a */
    private final C38120f f97059a;

    /* renamed from: b */
    private final RecordConfig f97060b;

    C38124g(C38120f fVar, RecordConfig recordConfig) {
        this.f97059a = fVar;
        this.f97060b = recordConfig;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C38120f fVar = this.f97059a;
        asyncAVService.uiService().recordService().startRecord((Context) fVar.f97032d, this.f97060b);
    }
}
