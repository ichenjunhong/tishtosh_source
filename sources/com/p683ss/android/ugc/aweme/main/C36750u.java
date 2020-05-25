package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;

/* renamed from: com.ss.android.ugc.aweme.main.u */
final /* synthetic */ class C36750u implements AsyncServiceLoader {

    /* renamed from: a */
    private final MainActivity f93921a;

    /* renamed from: b */
    private final RecordConfig f93922b;

    C36750u(MainActivity mainActivity, RecordConfig recordConfig) {
        this.f93921a = mainActivity;
        this.f93922b = recordConfig;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        this.f93921a.lambda$enterRecordFrom3rdPlatform$8$MainActivity(this.f93922b, asyncAVService, j);
    }
}
