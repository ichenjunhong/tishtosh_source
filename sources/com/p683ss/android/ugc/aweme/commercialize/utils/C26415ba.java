package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.C25944j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ba */
public final class C26415ba {

    /* renamed from: a */
    private static Aweme f69671a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ba$a */
    interface C26416a {
        /* renamed from: a */
        void mo54128a(boolean z);
    }

    /* renamed from: b */
    public static void m63878b() {
        Aweme aweme = f69671a;
        if (aweme != null) {
            m63876a((C26416a) new C26417bb(aweme));
        }
    }

    /* renamed from: a */
    public static void m63875a() {
        Aweme aweme = f69671a;
        if (aweme != null) {
            C25944j.m62908a().getFeedRawAdLogService().mo53149m(C11010c.m22280a(), aweme);
        }
    }

    /* renamed from: a */
    public static void m63877a(Aweme aweme) {
        f69671a = aweme;
    }

    /* renamed from: a */
    private static void m63876a(C26416a aVar) {
        C0013i.m12a(5000).mo19a((C0011g<TResult, TContinuationResult>) new C26418bc<TResult,TContinuationResult>(aVar));
    }
}
