package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.app.Activity;
import android.os.Build;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fi */
final /* synthetic */ class C5547fi implements Runnable {

    /* renamed from: a */
    private final Activity f14603a;

    C5547fi(Activity activity) {
        this.f14603a = activity;
    }

    public final void run() {
        Activity activity = this.f14603a;
        if ("SO-04J".equals(Build.MODEL)) {
            activity.recreate();
        }
    }
}
