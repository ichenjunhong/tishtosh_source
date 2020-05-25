package com.p683ss.android.ugc.aweme.account.task;

import android.content.Context;
import com.p683ss.android.sdk.p1207a.C19718b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.services.C23140a.C23141a;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.task.a */
public final class C22164a implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.NORMAL;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin() && C19718b.m48210a().mo41123a("facebook")) {
            C23141a.m56731a("facebook", C50310a.m108577b(), "");
        }
    }
}
