package com.p683ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;

/* renamed from: com.ss.android.ugc.aweme.live.o */
final /* synthetic */ class C36144o implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f92554a;

    /* renamed from: b */
    private final RecordConfig f92555b;

    C36144o(Activity activity, RecordConfig recordConfig) {
        this.f92554a = activity;
        this.f92555b = recordConfig;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this.f92554a, this.f92555b);
    }
}
