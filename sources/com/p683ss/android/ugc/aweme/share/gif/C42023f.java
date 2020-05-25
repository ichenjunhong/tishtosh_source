package com.p683ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.gif.f */
final /* synthetic */ class C42023f implements Runnable {

    /* renamed from: a */
    private final C42018b f106398a;

    /* renamed from: b */
    private final Activity f106399b;

    C42023f(C42018b bVar, Activity activity) {
        this.f106398a = bVar;
        this.f106399b = activity;
    }

    public final void run() {
        C42018b bVar = this.f106398a;
        Activity activity = this.f106399b;
        bVar.f106381b = C45547d.m99208b(activity, activity.getString(R.string.c0p));
        if (bVar.f106380a != null) {
            bVar.f106380a.f106799h.setValue(Boolean.valueOf(true));
        }
    }
}
