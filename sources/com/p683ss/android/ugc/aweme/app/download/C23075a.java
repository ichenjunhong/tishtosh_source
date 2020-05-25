package com.p683ss.android.ugc.aweme.app.download;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p683ss.android.ugc.aweme.experiment.DownloaderTTNetExperiment;
import com.p683ss.android.ugc.aweme.p2404y.C48421a;

/* renamed from: com.ss.android.ugc.aweme.app.download.a */
public final class C23075a implements C48421a {
    /* renamed from: a */
    public final boolean mo47811a() {
        if (DownloaderManagerHolder.f61481a == null) {
            DownloaderManagerHolder.f61481a = Boolean.valueOf(C10181b.m20511a().mo18172a(DownloaderTTNetExperiment.class, false, "downloader_use_ttnet_ab", 31744, false));
        }
        return DownloaderManagerHolder.f61481a.booleanValue();
    }
}
