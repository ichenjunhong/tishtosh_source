package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.router.q */
public final class C41293q implements IInterceptor {

    /* renamed from: a */
    public static final C41294a f104735a = new C41294a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.q$a */
    public static final class C41294a {
        private C41294a() {
        }

        public /* synthetic */ C41294a(C52707g gVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "chatting/message"
            r1 = 0
            if (r4 == 0) goto L_0x0010
            android.net.Uri r2 = r4.getUri()
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r2.getHost()
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            if (r4 == 0) goto L_0x001d
            android.net.Uri r4 = r4.getUri()
            if (r4 == 0) goto L_0x001d
            java.lang.String r1 = r4.getPath()
        L_0x001d:
            java.lang.String r4 = p2628d.p2639f.p2641b.C52711k.m112231a(r2, r1)
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.router.C41293q.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str = null;
        if (context instanceof Activity) {
            C25938a aVar = C25938a.f68488a;
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str = routeIntent.getUrl();
            }
            aVar.mo47180a(activity, str);
        } else {
            C25938a aVar2 = C25938a.f68488a;
            if (routeIntent != null) {
                str = routeIntent.getUrl();
            }
            aVar2.mo47182a(str);
        }
        return true;
    }
}
