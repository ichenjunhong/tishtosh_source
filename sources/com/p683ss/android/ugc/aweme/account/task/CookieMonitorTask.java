package com.p683ss.android.ugc.aweme.account.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.utils.C22294b;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.task.CookieMonitorTask */
public final class CookieMonitorTask implements LegoTask {
    public static final C22163a Companion = new C22163a(null);
    public static boolean isUpload;

    /* renamed from: com.ss.android.ugc.aweme.account.task.CookieMonitorTask$a */
    public static final class C22163a {
        private C22163a() {
        }

        public /* synthetic */ C22163a(C52707g gVar) {
            this();
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.IDLE;
    }

    public final void run(Context context) {
        if (!isUpload) {
            isUpload = true;
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin()) {
                C22294b.m55179a(1);
            }
        }
    }
}
