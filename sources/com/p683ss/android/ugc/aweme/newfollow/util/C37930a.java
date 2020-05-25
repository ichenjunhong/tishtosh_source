package com.p683ss.android.ugc.aweme.newfollow.util;

import android.net.ConnectivityManager;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.C22692c;
import com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.a */
public final class C37930a implements C27979p {

    /* renamed from: a */
    public static volatile boolean f96585a = true;

    /* renamed from: b */
    public static final C37931a f96586b = new C37931a(null);

    /* renamed from: com.ss.android.ugc.aweme.newfollow.util.a$a */
    public static final class C37931a {
        private C37931a() {
        }

        public /* synthetic */ C37931a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo47072b() {
    }

    /* renamed from: c */
    public final void mo47074c() {
    }

    /* renamed from: a */
    public final void mo47070a() {
        try {
            if (C20902b.m53242a() != null) {
                if (!f96585a) {
                    IAccountUserService a = C20902b.m53242a();
                    C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
                    if (a.isLogin()) {
                        ParentalPlatformManager.m55915a((C22692c) null);
                    }
                    f96585a = false;
                    try {
                        Object systemService = C11010c.m22280a().getSystemService("connectivity");
                        if (systemService != null) {
                            C23718g.m58207b().mo49151a(C37932b.m84796a((ConnectivityManager) systemService));
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type android.net.ConnectivityManager");
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            f96585a = false;
        } catch (Exception unused2) {
        }
    }
}
