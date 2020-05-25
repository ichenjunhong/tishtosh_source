package com.p683ss.android.ugc.aweme.share.improve.p2163c;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.bytedance.frameworks.baselib.network.http.p574e.C9916k;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import java.io.File;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.b */
public final class C42149b {
    /* renamed from: a */
    public static final boolean m92514a(File file) {
        if (file.exists() && file.length() <= 15728640) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final Activity m92512a(Context context) {
        C52711k.m112240b(context, "$this$tryAsActivity");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            if (contextThemeWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextThemeWrapper.getBaseContext();
                if (baseContext != null) {
                    return (Activity) baseContext;
                }
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
        }
        Activity g = C11016e.m22312g();
        if (g == null) {
            C52711k.m112234a();
        }
        return g;
    }

    /* renamed from: b */
    public static final String m92515b(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C52830p.m112456b(charSequence, (CharSequence) "timestamp=", false, 2, (Object) null)) {
            return str;
        }
        C9916k kVar = new C9916k(str);
        kVar.mo17851a("timestamp", C23728o.m58243a(System.currentTimeMillis()));
        return kVar.mo17849a();
    }

    /* renamed from: c */
    public static final String m92516c(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin()) {
                C9916k kVar = new C9916k(str);
                IAccountUserService g2 = C20854a.m53167g();
                C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                kVar.mo17852a("user_id", g2.getCurUserId());
                return kVar.mo17849a();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static final String m92513a(String str) {
        if (str == null || C52830p.m112411b(str, "http://", false, 2, null) || C52830p.m112411b(str, "https://", false, 2, null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str);
        return sb.toString();
    }
}
