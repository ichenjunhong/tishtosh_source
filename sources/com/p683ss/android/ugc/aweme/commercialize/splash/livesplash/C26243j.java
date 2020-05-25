package com.p683ss.android.ugc.aweme.commercialize.splash.livesplash;

import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.j */
final /* synthetic */ class C26243j implements Callable {

    /* renamed from: a */
    private final Aweme f69294a;

    /* renamed from: b */
    private final DownloadInfo f69295b;

    C26243j(Aweme aweme, DownloadInfo downloadInfo) {
        this.f69294a = aweme;
        this.f69295b = downloadInfo;
    }

    public final Object call() {
        return C262381.m63590a(this.f69294a, this.f69295b);
    }
}
