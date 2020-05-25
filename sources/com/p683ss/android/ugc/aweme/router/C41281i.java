package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.router.i */
public final class C41281i implements IInterceptor {

    /* renamed from: a */
    public static final C41282a f104731a = new C41282a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.i$a */
    public static final class C41282a {
        private C41282a() {
        }

        public /* synthetic */ C41282a(C52707g gVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "goods"
            r1 = 0
            if (r5 == 0) goto L_0x0010
            android.net.Uri r2 = r5.getUri()
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r2.getHost()
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r0 != 0) goto L_0x0043
            if (r5 == 0) goto L_0x0024
            android.net.Uri r0 = r5.getUri()
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r0.getHost()
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            if (r5 == 0) goto L_0x0032
            android.net.Uri r5 = r5.getUri()
            if (r5 == 0) goto L_0x0032
            java.lang.String r5 = r5.getPath()
            goto L_0x0033
        L_0x0032:
            r5 = r1
        L_0x0033:
            java.lang.String r5 = p2628d.p2639f.p2641b.C52711k.m112231a(r0, r5)
            java.lang.String r0 = "seeding/recommend"
            r2 = 2
            r3 = 0
            boolean r5 = p2628d.p2650m.C52830p.m112411b(r5, r0, r3, r2, r1)
            if (r5 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            return r3
        L_0x0043:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.router.C41281i.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str = null;
        if (context instanceof Activity) {
            C41288m generateRegisterRouter = C25539a.m62079a().generateRegisterRouter();
            if (generateRegisterRouter != null) {
                Activity activity = (Activity) context;
                if (routeIntent != null) {
                    str = routeIntent.getUrl();
                }
                generateRegisterRouter.mo47180a(activity, str);
            }
        } else {
            C41288m generateRegisterRouter2 = C25539a.m62079a().generateRegisterRouter();
            if (generateRegisterRouter2 != null) {
                if (routeIntent != null) {
                    str = routeIntent.getUrl();
                }
                generateRegisterRouter2.mo47182a(str);
            }
        }
        return true;
    }
}
