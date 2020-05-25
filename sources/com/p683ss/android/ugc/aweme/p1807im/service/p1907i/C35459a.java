package com.p683ss.android.ugc.aweme.p1807im.service.p1907i;

import android.util.Log;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.service.i.a */
public final class C35459a {

    /* renamed from: a */
    public static final C35459a f91126a = new C35459a();

    private C35459a() {
    }

    /* renamed from: a */
    public static final int m80148a(String str, String str2) {
        C52711k.m112240b(str, "tag");
        C52711k.m112240b(str2, "msg");
        return Log.d(str, str2);
    }

    /* renamed from: b */
    public static final void m80150b(String str, String str2) {
        C52711k.m112240b(str, "tag");
        C52711k.m112240b(str2, "msg");
        C32458a.m75141a(4, str, str2);
    }

    /* renamed from: c */
    public static final void m80151c(String str, String str2) {
        C52711k.m112240b(str, "tag");
        C52711k.m112240b(str2, "msg");
        C32458a.m75141a(6, str, str2);
    }

    /* renamed from: a */
    public static final void m80149a(String str, Throwable th) {
        C52711k.m112240b(str, "tag");
        C52711k.m112240b(th, "t");
        C32458a.m75141a(6, str, Log.getStackTraceString(th));
    }
}
