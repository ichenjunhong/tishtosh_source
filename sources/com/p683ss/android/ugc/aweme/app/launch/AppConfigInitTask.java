package com.p683ss.android.ugc.aweme.app.launch;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.common.config.AppConfig;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.launch.AppConfigInitTask */
public final class AppConfigInitTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
        AppConfig.getInstance(context).tryRefreshConfig(context instanceof Activity);
    }
}
