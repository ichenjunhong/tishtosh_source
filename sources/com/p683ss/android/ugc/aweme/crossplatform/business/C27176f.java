package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.webkit.DownloadListener;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.f */
final /* synthetic */ class C27176f implements DownloadListener {

    /* renamed from: a */
    private final DownloadBusiness f71699a;

    /* renamed from: b */
    private final C27309j f71700b;

    /* renamed from: c */
    private final Activity f71701c;

    C27176f(DownloadBusiness downloadBusiness, C27309j jVar, Activity activity) {
        this.f71699a = downloadBusiness;
        this.f71700b = jVar;
        this.f71701c = activity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        this.f71699a.mo55490a(this.f71700b, this.f71701c, str, str2, str3, str4, j);
    }
}
