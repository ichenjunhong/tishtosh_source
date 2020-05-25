package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.at */
final /* synthetic */ class C45402at implements AsyncServiceLoader {

    /* renamed from: a */
    private final C45399aq f114788a;

    /* renamed from: b */
    private final Builder f114789b;

    C45402at(C45399aq aqVar, Builder builder) {
        this.f114788a = aqVar;
        this.f114789b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        this.f114788a.mo91726a(this.f114789b, asyncAVService, j);
    }
}
