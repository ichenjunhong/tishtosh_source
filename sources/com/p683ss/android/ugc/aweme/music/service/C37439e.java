package com.p683ss.android.ugc.aweme.music.service;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ReshootConfig;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.music.service.e */
final /* synthetic */ class C37439e implements AsyncServiceLoader {

    /* renamed from: a */
    private final C374381 f95485a;

    /* renamed from: b */
    private final String f95486b;

    /* renamed from: c */
    private final long f95487c;

    /* renamed from: d */
    private final Activity f95488d;

    /* renamed from: e */
    private final MusicModel f95489e;

    C37439e(C374381 r1, String str, long j, Activity activity, MusicModel musicModel) {
        this.f95485a = r1;
        this.f95486b = str;
        this.f95487c = j;
        this.f95488d = activity;
        this.f95489e = musicModel;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C374381 r0 = this.f95485a;
        String str = this.f95486b;
        long j2 = this.f95487c;
        asyncAVService.uiService().recordService().startRecord(this.f95488d, new Builder().creationId(UUID.randomUUID().toString()).musicPath(str).startRecordTime(C37437d.this.f95479b).decompressTime(j).musicDownloadDuration(j2).reshootConfig(new ReshootConfig(true, Boolean.valueOf(true))).translationType(3).musicOrigin("single_song").build(), this.f95489e, true);
    }
}
