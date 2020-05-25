package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.music.ui.be */
final /* synthetic */ class C37536be implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f95762a;

    /* renamed from: b */
    private final Builder f95763b;

    /* renamed from: c */
    private final MusicModel f95764c;

    C37536be(Activity activity, Builder builder, MusicModel musicModel) {
        this.f95762a = activity;
        this.f95763b = builder;
        this.f95764c = musicModel;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        Activity activity = this.f95762a;
        Builder builder = this.f95763b;
        asyncAVService.uiService().recordService().startRecord(activity, builder.build(), this.f95764c, true);
    }
}
