package com.p683ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.gif.c */
final /* synthetic */ class C42020c implements Runnable {

    /* renamed from: a */
    private final C42018b f106388a;

    /* renamed from: b */
    private final Activity f106389b;

    C42020c(C42018b bVar, Activity activity) {
        this.f106388a = bVar;
        this.f106389b = activity;
    }

    public final void run() {
        C42018b bVar = this.f106388a;
        Activity activity = this.f106389b;
        if (bVar.f106381b != null) {
            bVar.f106381b.dismiss();
        }
        C10691a.m21546b((Context) activity, activity.getString(R.string.c0k), 1).mo19066a();
        if (bVar.f106380a != null) {
            bVar.f106380a.f106799h.setValue(Boolean.valueOf(false));
        }
    }
}
