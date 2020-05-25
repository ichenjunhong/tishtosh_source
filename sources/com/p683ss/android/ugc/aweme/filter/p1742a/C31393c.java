package com.p683ss.android.ugc.aweme.filter.p1742a;

import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29195e;
import com.p683ss.android.ugc.aweme.tools.beauty.C46870d;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46833c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.a.c */
public final class C31393c extends AbsDownloadListener {

    /* renamed from: a */
    private final C29192b<C46870d, Void> f82228a;

    /* renamed from: b */
    private final C29190b<C46870d, Void> f82229b;

    public final void onProgress(DownloadInfo downloadInfo) {
    }

    public final void onSuccessed(DownloadInfo downloadInfo) {
        C46833c.m101689b(((C46870d) this.f82228a.f76498g).f118406a);
        this.f82228a.mo59080a(3);
        this.f82228a.f76495d = null;
        this.f82229b.mo59067b(this.f82228a);
    }

    public C31393c(C29192b<C46870d, Void> bVar, C29190b<C46870d, Void> bVar2) {
        C52711k.m112240b(bVar, "task");
        C52711k.m112240b(bVar2, "callback");
        this.f82228a = bVar;
        this.f82229b = bVar2;
    }

    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        this.f82228a.mo59080a(4);
        C29192b<C46870d, Void> bVar = this.f82228a;
        Integer valueOf = Integer.valueOf(-1);
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        bVar.f76496e = new C29195e(valueOf, str, baseException);
        this.f82229b.mo59072c(this.f82228a);
    }
}
