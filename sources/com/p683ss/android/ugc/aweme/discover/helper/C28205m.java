package com.p683ss.android.ugc.aweme.discover.helper;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.m */
final /* synthetic */ class C28205m implements AsyncServiceLoader {

    /* renamed from: a */
    private final SearchMusicPlayerLifecycleObserver f74048a;

    /* renamed from: b */
    private final RecordConfig f74049b;

    /* renamed from: c */
    private final MusicModel f74050c;

    C28205m(SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver, RecordConfig recordConfig, MusicModel musicModel) {
        this.f74048a = searchMusicPlayerLifecycleObserver;
        this.f74049b = recordConfig;
        this.f74050c = musicModel;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver = this.f74048a;
        asyncAVService.uiService().recordService().startRecord((Activity) searchMusicPlayerLifecycleObserver.f74005a, this.f74049b, this.f74050c, false);
    }
}
