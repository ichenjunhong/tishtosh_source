package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.h */
final /* synthetic */ class C27504h implements AsyncServiceLoader {

    /* renamed from: a */
    private final C27497g f72318a;

    /* renamed from: b */
    private final Builder f72319b;

    C27504h(C27497g gVar, Builder builder) {
        this.f72318a = gVar;
        this.f72319b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this.f72318a.getActivity(), this.f72319b.build());
    }
}
