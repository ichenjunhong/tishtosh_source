package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.app.n */
public final class C23129n {
    /* renamed from: a */
    public static void m56687a(Intent intent, Context context, int i) {
        if (i == 5) {
            intent.setClassName(context, "com.bytedance.android.aweme.lite.home.HomeActivity");
        } else {
            intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        }
    }
}
