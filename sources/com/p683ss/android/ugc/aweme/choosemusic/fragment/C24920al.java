package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.al */
final /* synthetic */ class C24920al implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f65980a;

    /* renamed from: b */
    private final Builder f65981b;

    /* renamed from: c */
    private final MusicModel f65982c;

    C24920al(Activity activity, Builder builder, MusicModel musicModel) {
        this.f65980a = activity;
        this.f65981b = builder;
        this.f65982c = musicModel;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        Activity activity = this.f65980a;
        Builder builder = this.f65981b;
        asyncAVService.uiService().recordService().startRecord(activity, builder.build(), this.f65982c, true);
    }
}
