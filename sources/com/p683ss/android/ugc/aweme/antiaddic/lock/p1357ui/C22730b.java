package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.router.C41288m;
import com.p683ss.android.ugc.aweme.router.C41312z;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.b */
public final class C22730b implements IInterceptor, C41288m {
    /* renamed from: b */
    private static String m56013b(String str) {
        return C41312z.m91072b(str, "type");
    }

    /* renamed from: c */
    private static String m56014c(String str) {
        return C41312z.m91072b(str, "user_id");
    }

    /* renamed from: e */
    private static int m56016e(String str) {
        try {
            return Integer.parseInt(C41312z.m91072b(str, "chat_enabled"));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final boolean mo47182a(String str) {
        return mo47180a(null, str);
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return routeIntent.getOriginUrl().contains("privacy/setting/modify");
    }

    /* renamed from: d */
    private static int m56015d(String str) {
        String b = C41312z.m91072b(str, "chat_privacy");
        if (TextUtils.isEmpty(b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final boolean mo47180a(Activity activity, String str) {
        return mo47181a(activity, str, null);
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        mo47180a((Activity) context, routeIntent.getOriginUrl());
        return true;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r2v0, types: [android.content.Context, android.app.Activity] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47181a(android.content.Context r2, java.lang.String r3, android.view.View r4) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0006
            android.app.Activity r2 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
        L_0x0006:
            if (r2 != 0) goto L_0x000c
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
        L_0x000c:
            java.lang.String r4 = m56013b(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x003e
            java.lang.String r4 = m56013b(r3)
            java.lang.String r0 = "chat_privacy"
            boolean r4 = android.text.TextUtils.equals(r4, r0)
            if (r4 == 0) goto L_0x003e
            java.lang.String r4 = m56014c(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x002d
            goto L_0x003e
        L_0x002d:
            int r4 = m56015d(r3)
            java.lang.String r0 = m56014c(r3)
            int r3 = m56016e(r3)
            com.p683ss.android.ugc.aweme.setting.p2148ui.ChatControlSettingActivity.m91640a(r2, r4, r0, r3)
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22730b.mo47181a(android.app.Activity, java.lang.String, android.view.View):boolean");
    }
}
