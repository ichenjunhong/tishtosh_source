package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.router.k */
public final class C41284k implements IInterceptor {

    /* renamed from: a */
    public static final C41285a f104732a = new C41285a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.k$a */
    public static final class C41285a {
        private C41285a() {
        }

        public /* synthetic */ C41285a(C52707g gVar) {
            this();
        }
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            Uri uri = routeIntent.getUri();
            if (uri != null) {
                str = uri.getHost();
                return C52711k.m112239a((Object) str, (Object) "draft_box");
            }
        }
        str = null;
        return C52711k.m112239a((Object) str, (Object) "draft_box");
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Context context2;
        Class draftBoxActivity = AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getDraftBoxActivity();
        if (context instanceof Activity) {
            context.startActivity(new Intent(context, draftBoxActivity));
        } else {
            if (context == null) {
                context2 = C11010c.m22280a();
            } else {
                context2 = context;
            }
            Intent intent = new Intent(context, draftBoxActivity);
            intent.addFlags(268435456);
            context2.startActivity(intent);
        }
        return true;
    }
}
