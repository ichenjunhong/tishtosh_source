package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.main.r */
final /* synthetic */ class C36676r implements AsyncServiceLoader {

    /* renamed from: a */
    private final MainActivity f93825a;

    /* renamed from: b */
    private final Builder f93826b;

    C36676r(MainActivity mainActivity, Builder builder) {
        this.f93825a = mainActivity;
        this.f93826b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        this.f93825a.lambda$onBottomTabClick$0$MainActivity(this.f93826b, asyncAVService, j);
    }
}
