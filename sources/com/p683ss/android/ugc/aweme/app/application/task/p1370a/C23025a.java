package com.p683ss.android.ugc.aweme.app.application.task.p1370a;

import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.app.application.task.a.a */
public final class C23025a implements Runnable {

    /* renamed from: a */
    public static boolean f61364a;

    public final void run() {
        C23026b bVar = new C23026b(this);
        if (VERSION.SDK_INT >= 23) {
            bVar.run();
        }
    }
}
