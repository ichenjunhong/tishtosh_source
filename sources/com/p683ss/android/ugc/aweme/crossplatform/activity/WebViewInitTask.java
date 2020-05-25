package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.WebViewInitTask */
public class WebViewInitTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        if (VERSION.SDK_INT >= 23) {
            SystemClock.uptimeMillis();
            C27121o a = C27121o.m65429a();
            if (VERSION.SDK_INT >= 23 && !a.mo55436b() && a.f71550a.size() < a.f71551b) {
                C11010c.m22280a().getMainLooper().getQueue().addIdleHandler(new C27122p(a));
            }
            SystemClock.uptimeMillis();
        }
    }
}
