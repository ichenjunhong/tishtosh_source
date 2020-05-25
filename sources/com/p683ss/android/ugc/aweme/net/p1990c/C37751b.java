package com.p683ss.android.ugc.aweme.net.p1990c;

import com.bytedance.frameworks.baselib.network.http.C9894e.C9896b;
import com.bytedance.ttnet.p885c.C13297b;
import com.p683ss.android.common.applog.AppLog;

/* renamed from: com.ss.android.ugc.aweme.net.c.b */
public final class C37751b implements C9896b<C13297b> {
    /* renamed from: a */
    public final String mo17820a(String str, boolean z, Object... objArr) {
        return str;
    }

    /* renamed from: a */
    public final void mo17821a() {
    }

    /* renamed from: a */
    public final String mo17819a(String str, boolean z) {
        if (str == null || (!str.contains("/get_domains/") && !str.contains("/ttnet_crash/"))) {
            return str;
        }
        return AppLog.addCommonParams(str, z);
    }
}
