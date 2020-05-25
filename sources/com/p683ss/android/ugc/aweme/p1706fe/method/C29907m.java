package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.net.Uri;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.utils.C47787cs;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.m */
public final class C29907m {

    /* renamed from: a */
    public static final C29907m f78046a = new C29907m();

    private C29907m() {
    }

    /* renamed from: a */
    public static final boolean m70059a(String str) {
        if (str == null) {
            return false;
        }
        try {
            ILiveOuterService a = C36173w.m81665a();
            C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
            if (a.getLiveInitService().mo74819b()) {
                ILiveOuterService a2 = C36173w.m81665a();
                C52711k.m112236a((Object) a2, "ServiceManager.get().get…OuterService::class.java)");
                if (a2.getLive().mo15045a(C11010c.m22280a(), Uri.parse(str))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
        if (!C47787cs.m103416a(str)) {
            return false;
        }
        ILiveOuterService a3 = C36173w.m81665a();
        C52711k.m112236a((Object) a3, "ServiceManager.get().get…OuterService::class.java)");
        a3.getLive().mo74830p();
        return true;
    }
}
