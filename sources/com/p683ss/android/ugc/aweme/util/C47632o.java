package com.p683ss.android.ugc.aweme.util;

import android.app.Application;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.conan.IConanService;
import com.p683ss.android.ugc.aweme.p1632di.C27610ax;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.util.o */
public final class C47632o implements IConanService {
    /* renamed from: a */
    public static IConanService m103119a() {
        if (C27991b.f73427K == null) {
            synchronized (IConanService.class) {
                if (C27991b.f73427K == null) {
                    C27991b.f73427K = C27610ax.m66287b();
                }
            }
        }
        return (IConanService) C27991b.f73427K;
    }

    public final void init(Application application, boolean z) {
        C52711k.m112240b(application, "application");
    }

    public final void start() {
    }

    public final void stop() {
    }
}
