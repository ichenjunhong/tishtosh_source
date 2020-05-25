package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.ai */
final /* synthetic */ class C24917ai implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f65976a;

    /* renamed from: b */
    private final Builder f65977b;

    C24917ai(Activity activity, Builder builder) {
        this.f65976a = activity;
        this.f65977b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this.f65976a, this.f65977b.build());
    }
}
