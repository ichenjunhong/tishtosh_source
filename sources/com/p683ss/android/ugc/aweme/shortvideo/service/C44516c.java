package com.p683ss.android.ugc.aweme.shortvideo.service;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import com.p683ss.android.ugc.aweme.policy.C39498b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.service.c */
final /* synthetic */ class C44516c implements OnShowListener {

    /* renamed from: a */
    private final Activity f112630a;

    C44516c(Activity activity) {
        this.f112630a = activity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        new C39498b(this.f112630a).mo80526a();
    }
}
