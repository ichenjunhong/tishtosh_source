package com.p683ss.android.ugc.aweme.push;

import android.app.Activity;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.push.b */
public final class C40885b implements DeepLinkReturnHelperService {
    /* renamed from: a */
    public static DeepLinkReturnHelperService m90457a() {
        if (C27991b.f73515k == null) {
            synchronized (DeepLinkReturnHelperService.class) {
                if (C27991b.f73515k == null) {
                    C27991b.f73515k = C27628bo.m66308c();
                }
            }
        }
        return (DeepLinkReturnHelperService) C27991b.f73515k;
    }

    public final void onFinish(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C40884a.m90455a(activity);
    }
}
