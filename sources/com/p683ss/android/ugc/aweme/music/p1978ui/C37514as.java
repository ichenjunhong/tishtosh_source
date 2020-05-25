package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.music.ui.as */
final /* synthetic */ class C37514as implements AsyncServiceLoader {

    /* renamed from: a */
    private final MusicDetailFragment f95709a;

    /* renamed from: b */
    private final String f95710b;

    /* renamed from: c */
    private final long f95711c;

    /* renamed from: d */
    private final Activity f95712d;

    /* renamed from: e */
    private final MusicModel f95713e;

    C37514as(MusicDetailFragment musicDetailFragment, String str, long j, Activity activity, MusicModel musicModel) {
        this.f95709a = musicDetailFragment;
        this.f95710b = str;
        this.f95711c = j;
        this.f95712d = activity;
        this.f95713e = musicModel;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        this.f95709a.mo76976a(this.f95710b, this.f95711c, this.f95712d, this.f95713e, asyncAVService, j);
    }
}
