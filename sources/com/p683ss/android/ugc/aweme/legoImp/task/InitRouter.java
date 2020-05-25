package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.smartanchor_declaration.RouterAnchorPoint;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.p1378h.C23103a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.router.C41301v;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitRouter */
public class InitRouter implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C22574a.m55738f().mo46917a("method_init_smart_router_duration", false);
        C41302w.f104750a.add(new C41301v());
        Application application = (Application) context;
        if (C41302w.f104752c == null) {
            synchronized (C41302w.class) {
                if (C41302w.f104752c == null) {
                    C41302w.f104752c = new C41302w(application);
                }
            }
        }
        C41302w.m91042a();
        C41302w.f104751b = new C23103a();
        SmartRouter.init(AwemeApplication.m56199a());
        I18nBridgeService.getBridgeService_Monster().initRouterConfig();
        RouterAnchorPoint.getPoint().run(new Object());
        C22574a.m55738f().mo46921b("method_init_smart_router_duration", false);
    }
}
