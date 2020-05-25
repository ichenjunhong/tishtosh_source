package com.p683ss.android.ugc.aweme.splash;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$SplashNetWorkImpl$1 */
class SplashAdManagerHolder$SplashNetWorkImpl$1 implements LegoTask {
    final /* synthetic */ C45687b this$0;
    final /* synthetic */ String val$microUrl;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        C36983a.m83185b().mo76294a().preloadMiniApp(this.val$microUrl);
    }

    SplashAdManagerHolder$SplashNetWorkImpl$1(C45687b bVar, String str) {
        this.this$0 = bVar;
        this.val$microUrl = str;
    }
}
