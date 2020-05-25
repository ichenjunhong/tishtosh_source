package com.p683ss.android.ugc.aweme.p1632di;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.bullet.kit.p644rn.IRnKitApi;
import com.bytedance.ies.bullet.kit.web.IWebKitApi;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.bullet.C24108b;
import com.p683ss.android.ugc.aweme.bullet.C24256c;
import com.p683ss.android.ugc.aweme.bullet.C24265d;
import com.p683ss.android.ugc.aweme.bullet.C24266e;
import com.p683ss.android.ugc.aweme.bullet.C24278f;
import com.p683ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p683ss.android.ugc.aweme.bullet.p1475c.C24257a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.di.ap */
public final class C27602ap {
    /* renamed from: a */
    public static IBulletService m66281a() {
        BulletService bulletService = new BulletService();
        C52711k.m112240b(bulletService, "bulletService");
        bulletService.enableKitApi(IRnKitApi.class, true);
        bulletService.enableKitApi(IWebKitApi.class, false);
        bulletService.registerDefaultPackageBundle(new C24265d());
        bulletService.registerPackageBundle("ad_commerce", new C24257a());
        bulletService.setDebuggable(false);
        Context a = C11010c.m22280a();
        if (a != null) {
            bulletService.setApplication((Application) a);
            Context a2 = C11010c.m22280a();
            if (a2 != null) {
                Application application = (Application) a2;
                AwemeAppData a3 = C19555f.m47851a();
                C52711k.m112236a((Object) a3, "BaseAppData.inst()");
                C19767n f = a3.mo40808f();
                C52711k.m112236a((Object) f, "BaseAppData.inst().offlineConfig");
                bulletService.setResourceLoader(new C24266e(application, f));
                bulletService.setReporter(C24108b.f63984a);
                bulletService.setSettings(C24256c.f64379a);
                bulletService.setKitDynamicFeature(C24278f.f64410a);
                return bulletService;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Application");
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Application");
    }
}
