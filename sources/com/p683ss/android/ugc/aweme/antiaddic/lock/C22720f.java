package com.p683ss.android.ugc.aweme.antiaddic.lock;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.f */
public final class C22720f {

    /* renamed from: a */
    public static final C22720f f60926a = new C22720f();

    private C22720f() {
    }

    /* renamed from: a */
    public static void m55961a() {
        TeenageModeSetting a = C22721g.m55962a();
        if (a != null) {
            a.setTeenageModeSelf(true);
        }
        C23183v a2 = C23183v.m56778a();
        C52711k.m112236a((Object) a2, "CommonSharePrefCache.inst()");
        C23051bf q = a2.mo47921q();
        C52711k.m112236a((Object) q, "CommonSharePrefCache.inst().hasOpenTeenMode");
        q.mo47776a(Boolean.valueOf(true));
        IAccountUserService a3 = C20902b.m53242a();
        C52711k.m112236a((Object) a3, "AccountUserProxyService.get()");
        C26890h.m65011a("open_teen_mode_finish", C23089d.m56640a().mo47826a("is_login", a3.isLogin() ? 1 : 0).f61491a);
        C10691a.m21533a(C11010c.m22280a(), (int) R.string.d8g).mo19066a();
        C22722h.m55978a();
        C40869c.m90378c();
    }
}
