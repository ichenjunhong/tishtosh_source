package com.p683ss.android.ugc.aweme.p1807im.disableim;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p879t.p882c.C13248c;
import com.bytedance.router.SmartRouter;

/* renamed from: com.ss.android.ugc.aweme.im.disableim.c */
public final class C33192c {

    /* renamed from: a */
    public static final C33192c f86190a = new C33192c();

    private C33192c() {
    }

    /* renamed from: a */
    public static void m76259a() {
        if (!C13248c.m26638a(ImUnder16Manger.m76254g())) {
            SmartRouter.buildRoute(C11010c.m22280a(), "//webview").withParam("url", ImUnder16Manger.m76254g()).withParam("hide_nav_bar", true).open();
        }
    }

    /* renamed from: a */
    public static void m76260a(Context context) {
        if (!C13248c.m26638a(ImUnder16Manger.m76253f())) {
            SmartRouter.buildRoute(C11010c.m22280a(), "//webview").withParam("url", ImUnder16Manger.m76253f()).withParam("hide_nav_bar", true).open();
        }
    }
}
