package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.CustomChannelHandler;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.p1163f.C19143a;
import com.p683ss.android.p1163f.C19143a.C19144a;
import com.p683ss.android.p1163f.C19143a.C19145b;
import com.p683ss.android.p1163f.C19149b;
import com.p683ss.android.p1163f.C19158d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52711k;

public final class LazyLoadLegoTask implements LegoTask {
    private final Application application;

    public final Application getApplication() {
        return this.application;
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public LazyLoadLegoTask(Application application2) {
        C52711k.m112240b(application2, "application");
        this.application = application2;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C19143a a = new C19145b().mo39088a(C11010c.m22290k(), C11010c.m22291l()).mo39087a(C11010c.m22295p()).mo39086a(C19144a.RELEASE).mo39091b(AppLog.getServerDeviceId()).mo39092c(C11010c.m22288i()).mo39085a((int) C11010c.m22287h()).mo39090b(C11010c.m22289j()).mo39089a();
        C52711k.m112236a((Object) a, "configrationBuilder.conf…nager.getAppId()).build()");
        C19158d.m46704a().mo39104a(this.application, a, C18920g.m46048a(context));
        C19158d.m46704a().mo39105a(C19149b.f52765a);
        if (!CustomChannelHandler.inst(C11010c.m22280a()).hasGetChannels()) {
            CustomChannelHandler.inst(C11010c.m22280a()).loadInfoFromSp();
            CustomChannelHandler.inst(C11010c.m22280a()).getAppChannel(C11054a.f29684b);
        }
    }
}
