package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.main.al */
final /* synthetic */ class C36497al implements AsyncServiceLoader {

    /* renamed from: a */
    private final MainActivity f93567a;

    /* renamed from: b */
    private final Builder f93568b;

    C36497al(MainActivity mainActivity, Builder builder) {
        this.f93567a = mainActivity;
        this.f93568b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        this.f93567a.lambda$null$15$MainActivity(this.f93568b, asyncAVService, j);
    }
}
