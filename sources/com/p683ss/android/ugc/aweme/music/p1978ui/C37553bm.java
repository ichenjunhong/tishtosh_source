package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bm */
final /* synthetic */ class C37553bm implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f95804a;

    /* renamed from: b */
    private final Builder f95805b;

    C37553bm(Activity activity, Builder builder) {
        this.f95804a = activity;
        this.f95805b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this.f95804a, this.f95805b.build());
    }
}
