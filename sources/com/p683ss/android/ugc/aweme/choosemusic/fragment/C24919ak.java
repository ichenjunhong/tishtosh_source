package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.ak */
final /* synthetic */ class C24919ak implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f65979a;

    C24919ak(Activity activity) {
        this.f65979a = activity;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        Activity activity = this.f65979a;
        Builder builder = new Builder();
        builder.keepChallenge(true);
        asyncAVService.uiService().recordService().startRecord((Context) activity, builder.build());
    }
}
