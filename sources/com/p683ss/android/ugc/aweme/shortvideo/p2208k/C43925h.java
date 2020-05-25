package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.DuetConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.h */
final /* synthetic */ class C43925h implements AsyncServiceLoader {

    /* renamed from: a */
    private final C43911c f111223a;

    /* renamed from: b */
    private final RecordConfig f111224b;

    /* renamed from: c */
    private final DuetConfig f111225c;

    C43925h(C43911c cVar, RecordConfig recordConfig, DuetConfig duetConfig) {
        this.f111223a = cVar;
        this.f111224b = recordConfig;
        this.f111225c = duetConfig;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        this.f111223a.mo89466a(this.f111224b, this.f111225c, asyncAVService, j);
    }
}
