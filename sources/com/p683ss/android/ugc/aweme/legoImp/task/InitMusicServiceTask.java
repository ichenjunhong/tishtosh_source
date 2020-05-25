package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p2404y.C48421a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask */
public final class InitMusicServiceTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private final void initMusicDownloadStrategy() {
        int i;
        C48421a k = C23794bh.m58397k();
        C52711k.m112236a((Object) k, "LegacyServiceUtils.getDownloadService()");
        if (k.mo47811a()) {
            i = 3;
        } else {
            i = 2;
        }
        MusicService.createIMusicServicebyMonsterPlugin().setDownloadStrategy(i);
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        MusicService.createIMusicServicebyMonsterPlugin().initService();
        initMusicDownloadStrategy();
    }
}
