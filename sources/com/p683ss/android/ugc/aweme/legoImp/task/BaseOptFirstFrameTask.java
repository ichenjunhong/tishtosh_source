package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Looper;
import android.support.p030v4.view.C1028c;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.notice.api.C38021a;
import com.p683ss.android.ugc.aweme.notice.api.C38027b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41687b;
import com.p683ss.android.ugc.aweme.wiki.AddWikiActivity;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseOptFirstFrameTask */
public abstract class BaseOptFirstFrameTask implements LegoTask {
    private void preloadInstance(Object obj) {
    }

    /* access modifiers changed from: protected */
    public abstract void getMiniAppServiceIfNeed();

    public C35896f process() {
        return C35896f.MAIN;
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        new AddWikiActivity();
        new C1028c(context);
        getMiniAppServiceIfNeed();
        preloadInstance(C41687b.f105513b);
        C40869c.m90387r();
        AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enablePreUploadByUser();
        C38021a aVar = C38021a.f96788c;
        C38027b bVar = (C38027b) C38021a.f96787b.getValue();
    }
}
