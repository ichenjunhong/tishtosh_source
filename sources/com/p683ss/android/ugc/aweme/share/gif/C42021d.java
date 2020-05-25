package com.p683ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.gif.p2158ui.VideoShare2GifEditActivity;

/* renamed from: com.ss.android.ugc.aweme.share.gif.d */
final /* synthetic */ class C42021d implements Runnable {

    /* renamed from: a */
    private final C42018b f106390a;

    /* renamed from: b */
    private final Activity f106391b;

    /* renamed from: c */
    private final Aweme f106392c;

    /* renamed from: d */
    private final String f106393d;

    /* renamed from: e */
    private final String f106394e;

    /* renamed from: f */
    private final String f106395f;

    C42021d(C42018b bVar, Activity activity, Aweme aweme, String str, String str2, String str3) {
        this.f106390a = bVar;
        this.f106391b = activity;
        this.f106392c = aweme;
        this.f106393d = str;
        this.f106394e = str2;
        this.f106395f = str3;
    }

    public final void run() {
        C42018b bVar = this.f106390a;
        Activity activity = this.f106391b;
        Aweme aweme = this.f106392c;
        String str = this.f106393d;
        String str2 = this.f106394e;
        String str3 = this.f106395f;
        if (!activity.isFinishing()) {
            if (bVar.f106381b != null) {
                bVar.f106381b.dismiss();
            }
            VideoShare2GifEditActivity.m91996a(activity, aweme.getAid(), aweme.getAuthorUid(), aweme.isReviewed(), str, str2, str3);
            if (bVar.f106380a != null) {
                bVar.f106380a.f106799h.setValue(Boolean.valueOf(false));
            }
        }
    }
}
