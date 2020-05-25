package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.j */
final /* synthetic */ class C45445j implements Runnable {

    /* renamed from: a */
    private final Activity f114848a;

    /* renamed from: b */
    private final Intent f114849b;

    C45445j(Activity activity, Intent intent) {
        this.f114848a = activity;
        this.f114849b = intent;
    }

    public final void run() {
        this.f114848a.startActivity(this.f114849b);
    }
}
