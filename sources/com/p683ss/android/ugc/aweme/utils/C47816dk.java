package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.utils.dk */
final /* synthetic */ class C47816dk implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f120367a;

    C47816dk(Activity activity) {
        this.f120367a = activity;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this.f120367a, new Builder().showStickerPanel(true).build());
    }
}
