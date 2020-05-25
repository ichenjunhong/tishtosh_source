package com.p683ss.android.ugc.aweme.app.p1363a;

import android.app.Application;
import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.C23297av;
import com.p683ss.android.ugc.aweme.C23342b;
import com.p683ss.android.ugc.aweme.C23767bc;
import com.p683ss.android.ugc.aweme.IAccountService.C20835b;
import com.p683ss.android.ugc.aweme.IAccountUserService.C20841a;
import com.p683ss.android.ugc.aweme.app.application.p1368a.C23014a;
import com.p683ss.android.ugc.aweme.app.application.p1368a.C23015b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.a.a */
public final class C22883a {

    /* renamed from: a */
    public static final C22883a f61213a = new C22883a();

    private C22883a() {
    }

    /* renamed from: e */
    private static String m56351e() {
        return "api.tiktokv.com";
    }

    /* renamed from: a */
    private static C23297av m56346a() {
        return new C22908d();
    }

    /* renamed from: b */
    private static C20835b m56348b() {
        return new C23015b();
    }

    /* renamed from: c */
    private static C23767bc m56349c() {
        return new C23014a();
    }

    /* renamed from: d */
    private static C20841a m56350d() {
        return new C22910f();
    }

    /* renamed from: f */
    private static C23342b m56352f() {
        return new C22889c();
    }

    /* renamed from: a */
    public static final void m56347a(Application application) {
        C52711k.m112240b(application, "appContext");
        C20842a.m53149a(application, m56346a(), m56348b(), m56349c(), C22888b.m56361a(), m56350d(), new C22918n(), m56351e(), m56352f());
    }
}
