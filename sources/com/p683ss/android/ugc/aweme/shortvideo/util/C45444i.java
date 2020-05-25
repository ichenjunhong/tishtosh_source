package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.i */
final /* synthetic */ class C45444i implements Runnable {

    /* renamed from: a */
    private final Activity f114846a;

    /* renamed from: b */
    private final Intent f114847b;

    C45444i(Activity activity, Intent intent) {
        this.f114846a = activity;
        this.f114847b = intent;
    }

    public final void run() {
        this.f114846a.startActivity(this.f114847b);
    }
}
