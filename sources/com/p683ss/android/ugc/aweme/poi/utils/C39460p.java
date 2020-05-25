package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.p */
public final class C39460p {

    /* renamed from: a */
    public static final C39460p f100884a = new C39460p();

    private C39460p() {
    }

    /* renamed from: a */
    public static final void m87759a(Context context, Bundle bundle, View view) {
        if (context != null) {
            SmartRoute withParam = SmartRouter.buildRoute(context, "//detail").withParam(bundle);
            if (view != null) {
                C0643c b = C0643c.m1729b(view, 0, 0, view.getWidth(), view.getHeight());
                C52711k.m112236a((Object) b, "ActivityOptionsCompat.ma… view.width, view.height)");
                withParam.withBundleAnimation(b.mo2171a());
            }
            withParam.open();
        }
    }

    /* renamed from: a */
    public static final void m87761a(Context context, String str, Bundle bundle) {
        if (context != null) {
            if (!C39461q.m87763a(context)) {
                C10691a.m21542b(context, (int) R.string.cg1).mo19066a();
                return;
            }
            SmartRouter.buildRoute(context, "//webview").withParam("url", str).withParam(bundle).open();
        }
    }

    /* renamed from: a */
    public static final void m87762a(Context context, String str, String str2) {
        if (context != null) {
            C36960b a = new C36961a().mo76222b(str2).mo76223c("021001").mo76221a();
            C36983a b = C36983a.m83185b();
            C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
            b.mo76294a().openMiniApp(context, str, a);
        }
    }

    /* renamed from: a */
    public static final void m87760a(Context context, Integer num, String str, String str2, String str3) {
        int i;
        String str4;
        boolean z = false;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            }
            if (z) {
                str4 = str;
            } else {
                str4 = null;
            }
            if (str4 != null) {
                if (i == 2) {
                    m87762a(context, str, str2);
                } else {
                    C39452l.m87727a(context, str, str2, str3);
                }
            }
        }
    }
}
