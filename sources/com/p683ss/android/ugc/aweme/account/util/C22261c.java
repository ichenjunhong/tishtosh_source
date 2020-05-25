package com.p683ss.android.ugc.aweme.account.util;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.C22835a;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.account.util.c */
public final class C22261c {

    /* renamed from: a */
    public static final C22261c f60035a = new C22261c();

    private C22261c() {
    }

    /* renamed from: a */
    public static void m55107a(Context context, String str, Integer num, String str2, String str3, String str4) {
        if (context != null) {
            SmartRouter.buildRoute(context, "//user/banned").withParam(C22835a.f61196a, str).withParam("banned_code", (Serializable) num).withParam("enter_type", str2).withParam("enter_method", str3).withParam("platfrom", str4).open();
        }
    }
}
