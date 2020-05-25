package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadProfileClass */
public final class PreloadProfileClass implements LegoTask {
    private final void preloadInstance(Object obj) {
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        List<Class> preloadProfileClass = I18nBridgeService.getBridgeService_Monster().preloadProfileClass();
        C52711k.m112236a((Object) preloadProfileClass, "ServiceManager.get().get…va).preloadProfileClass()");
        for (Class cls : preloadProfileClass) {
            C52711k.m112236a((Object) cls, "it");
            preloadInstance(cls);
        }
    }
}
