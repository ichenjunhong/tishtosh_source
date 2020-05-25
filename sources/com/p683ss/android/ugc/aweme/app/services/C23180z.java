package com.p683ss.android.ugc.aweme.app.services;

import android.app.Activity;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.main.service.C36698s;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import com.p683ss.android.ugc.aweme.push.C40884a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.z */
public final class C23180z implements C36698s {
    /* renamed from: a */
    public static C36698s m56776a() {
        if (C27991b.f73421E == null) {
            synchronized (C36698s.class) {
                if (C27991b.f73421E == null) {
                    C27991b.f73421E = C27613b.m66290c();
                }
            }
        }
        return (C36698s) C27991b.f73421E;
    }

    /* renamed from: a */
    public final void mo47889a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C40884a.m90455a(activity);
    }
}
