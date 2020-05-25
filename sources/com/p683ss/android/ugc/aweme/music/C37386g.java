package com.p683ss.android.ugc.aweme.music;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.music.g */
final /* synthetic */ class C37386g implements AsyncServiceLoader {

    /* renamed from: a */
    private final Activity f95377a;

    /* renamed from: b */
    private final RecordConfig f95378b;

    /* renamed from: c */
    private final MusicModel f95379c;

    C37386g(Activity activity, RecordConfig recordConfig, MusicModel musicModel) {
        this.f95377a = activity;
        this.f95378b = recordConfig;
        this.f95379c = musicModel;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(this.f95377a, this.f95378b, this.f95379c, true);
    }
}
