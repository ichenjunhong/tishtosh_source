package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadManager$1 */
class AwesomeSplashPreloadManager$1 implements LegoTask {
    final /* synthetic */ C26217c this$0;
    final /* synthetic */ Aweme val$aweme;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        C36983a.m83185b().mo76294a().preloadMiniApp(this.val$aweme.getMicroAppInfo().getAppId(), this.val$aweme.getMicroAppInfo().getType());
    }

    AwesomeSplashPreloadManager$1(C26217c cVar, Aweme aweme) {
        this.this$0 = cVar;
        this.val$aweme = aweme;
    }
}
