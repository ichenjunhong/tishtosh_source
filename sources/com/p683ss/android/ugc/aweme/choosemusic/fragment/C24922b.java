package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.b */
final /* synthetic */ class C24922b implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f65983a;

    /* renamed from: b */
    private final Builder f65984b;

    C24922b(Activity activity, Builder builder) {
        this.f65983a = activity;
        this.f65984b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        Activity activity = this.f65983a;
        asyncAVService.uiService().recordService().startRecord((Context) activity, this.f65984b.build());
        activity.finish();
    }
}
