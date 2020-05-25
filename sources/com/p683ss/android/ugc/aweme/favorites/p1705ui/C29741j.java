package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.j */
final /* synthetic */ class C29741j implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f77677a;

    /* renamed from: b */
    private final Builder f77678b;

    /* renamed from: c */
    private final MusicModel f77679c;

    C29741j(Activity activity, Builder builder, MusicModel musicModel) {
        this.f77677a = activity;
        this.f77678b = builder;
        this.f77679c = musicModel;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        Activity activity = this.f77677a;
        Builder builder = this.f77678b;
        asyncAVService.uiService().recordService().startRecord(activity, builder.build(), this.f77679c, true);
    }
}
