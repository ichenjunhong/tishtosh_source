package com.p683ss.android.ugc.aweme.commercialize.splash.livesplash;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.LiveAwesomeSplashPreloadTask */
public final class LiveAwesomeSplashPreloadTask implements LegoTask {
    private final List<Aweme> awemesList;

    public final List<Aweme> getAwemesList() {
        return this.awemesList;
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public LiveAwesomeSplashPreloadTask(List<Aweme> list) {
        this.awemesList = list;
    }

    public final void run(Context context) {
        C25945k.m62919j().mo53882a(context, this.awemesList);
    }
}
