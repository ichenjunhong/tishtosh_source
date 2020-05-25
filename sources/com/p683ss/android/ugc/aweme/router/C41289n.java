package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23137q;
import com.p683ss.android.ugc.aweme.app.PushLoginActivity;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.utils.p2387a.C47659c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.router.n */
public final class C41289n implements IInterceptor, C41288m {

    /* renamed from: a */
    public static final C41290a f104734a = new C41290a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.n$a */
    public static final class C41290a {
        private C41290a() {
        }

        public /* synthetic */ C41290a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo47182a(String str) {
        C52711k.m112240b(str, "url");
        return mo47181a(null, str, null);
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2 = "login";
        if (routeIntent != null) {
            Uri uri = routeIntent.getUri();
            if (uri != null) {
                str = uri.getHost();
                return C52711k.m112239a((Object) str2, (Object) str);
            }
        }
        str = null;
        return C52711k.m112239a((Object) str2, (Object) str);
    }

    /* renamed from: a */
    public final boolean mo47180a(Activity activity, String str) {
        return mo47181a(activity, str, null);
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            mo47180a(activity, str2);
        } else {
            Activity g = C11016e.m22312g();
            if (g != null) {
                if (routeIntent != null) {
                    str2 = routeIntent.getUrl();
                }
                mo47180a(g, str2);
            } else {
                if (routeIntent != null) {
                    str = routeIntent.getUrl();
                } else {
                    str = null;
                }
                mo47180a(null, str);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo47181a(Activity activity, String str, View view) {
        if (C52711k.m112239a((Object) "push", (Object) Uri.parse(str).getQueryParameter("enter_from"))) {
            Context context = activity;
            Intent a = C47659c.m103160a(context);
            Intent intent = new Intent(context, PushLoginActivity.class);
            if (activity != null) {
                IAccountUserService a2 = C20902b.m53242a();
                C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
                if (!a2.isLogin()) {
                    C23137q a3 = C23137q.m56698a();
                    C52711k.m112236a((Object) a3, "AwemeRuntime.inst()");
                    if (a3.mo47855c()) {
                        activity.startActivity(intent);
                    } else {
                        activity.startActivities(new Intent[]{a, intent});
                    }
                    return true;
                }
            }
            Context a4 = C11010c.m22280a();
            C52711k.m112236a((Object) a, "mainIntent");
            a.setFlags(268435456);
            a4.startActivity(a);
            return true;
        }
        if (activity == null) {
            C27965f.m66719a(C11016e.m22312g(), "h5", "");
        } else {
            C27965f.m66719a(activity, "h5", "");
        }
        return true;
    }
}
