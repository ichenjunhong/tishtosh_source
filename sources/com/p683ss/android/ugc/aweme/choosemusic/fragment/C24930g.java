package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.g */
final /* synthetic */ class C24930g implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f66018a;

    /* renamed from: b */
    private final Builder f66019b;

    C24930g(Activity activity, Builder builder) {
        this.f66018a = activity;
        this.f66019b = builder;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) this.f66018a, this.f66019b.build());
    }
}
