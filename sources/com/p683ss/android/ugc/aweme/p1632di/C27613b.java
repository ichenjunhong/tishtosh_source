package com.p683ss.android.ugc.aweme.p1632di;

import com.p683ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p683ss.android.ugc.aweme.app.services.C23145aa;
import com.p683ss.android.ugc.aweme.app.services.C23162j;
import com.p683ss.android.ugc.aweme.app.services.C23165l;
import com.p683ss.android.ugc.aweme.app.services.C23180z;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.commerce.p1529a.C25484a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31296a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.i18n.BridgeService;
import com.p683ss.android.ugc.aweme.main.service.C36685g;
import com.p683ss.android.ugc.aweme.main.service.C36687h;
import com.p683ss.android.ugc.aweme.main.service.C36698s;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.IExternalService;

/* renamed from: com.ss.android.ugc.aweme.di.b */
public final class C27613b {
    /* renamed from: a */
    public static IBridgeService m66288a() {
        return new BridgeService();
    }

    /* renamed from: b */
    public static IExternalService m66289b() {
        return new AVExternalServiceImpl();
    }

    /* renamed from: c */
    public static C36698s m66290c() {
        return new C23180z();
    }

    /* renamed from: d */
    public static C36699t m66291d() {
        return new C23145aa();
    }

    /* renamed from: e */
    public static IUserService m66292e() {
        return new BaseUserService();
    }

    /* renamed from: f */
    public static C31296a m66293f() {
        return C31301a.m73024a();
    }

    /* renamed from: g */
    public static C36687h m66294g() {
        return C23165l.m56763a();
    }

    /* renamed from: h */
    public static C36685g m66295h() {
        return C23162j.m56758a();
    }

    /* renamed from: i */
    public static IAnyWhereDoor m66296i() {
        return new C25484a();
    }
}
