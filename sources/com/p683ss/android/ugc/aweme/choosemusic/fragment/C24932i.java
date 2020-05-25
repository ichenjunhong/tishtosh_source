package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.i */
final /* synthetic */ class C24932i implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f66021a;

    /* renamed from: b */
    private final Builder f66022b;

    /* renamed from: c */
    private final MusicModel f66023c;

    C24932i(Activity activity, Builder builder, MusicModel musicModel) {
        this.f66021a = activity;
        this.f66022b = builder;
        this.f66023c = musicModel;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        Activity activity = this.f66021a;
        Builder builder = this.f66022b;
        asyncAVService.uiService().recordService().startRecord(activity, builder.build(), this.f66023c, true);
    }
}
