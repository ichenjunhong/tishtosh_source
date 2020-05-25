package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadTask */
public class AwesomeSplashPreloadTask implements LegoTask {
    private final List<Aweme> awemeList;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public AwesomeSplashPreloadTask(List<Aweme> list) {
        this.awemeList = list;
    }

    public void run(Context context) {
        C32458a.m75144a("AwesomeSplashPreloadTask");
        C25945k.m62918i().mo53858a(context, this.awemeList);
    }
}
