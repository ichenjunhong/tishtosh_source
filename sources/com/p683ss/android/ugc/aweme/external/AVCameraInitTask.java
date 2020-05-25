package com.p683ss.android.ugc.aweme.external;

import android.content.Context;
import com.p683ss.android.ugc.aweme.C23951bq.C23952a;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.external.AVCameraInitTask */
public final class AVCameraInitTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C45407ay.m98973d("camera preLoad so start");
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get()\n   …ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService();
        C23952a.m58759a().preLoadVESo();
        C45407ay.m98973d("camera preLoad so end");
    }
}
