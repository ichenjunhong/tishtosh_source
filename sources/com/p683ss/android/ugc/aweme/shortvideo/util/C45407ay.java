package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.util.Log;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.tools.foundation.C47060a;
import com.p683ss.android.ugc.aweme.tools.foundation.C47061b;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ay */
public final class C45407ay {
    /* renamed from: a */
    public static void m98969a(Throwable th) {
        C32458a.m75141a(6, "Tools-Client", m98970b(th));
    }

    /* renamed from: a */
    public static void m98968a(String str) {
        C32458a.m75141a(3, "Tools-Client", str);
        C45408az.m98974a(3, "Tools-Client", str);
        C47061b.m102184b(C47060a.f118841a, str);
    }

    /* renamed from: b */
    public static String m98970b(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return Log.getStackTraceString(th);
    }

    /* renamed from: c */
    public static void m98972c(String str) {
        C32458a.m75141a(5, "Tools-Client", str);
        C45408az.m98974a(5, "Tools-Client", str);
        C47061b.m102187e(C47060a.f118841a, str);
    }

    /* renamed from: d */
    public static void m98973d(String str) {
        C32458a.m75141a(4, "Tools-Client", str);
        C45408az.m98974a(4, "Tools-Client", str);
        C47061b.m102185c(C47060a.f118841a, str);
    }

    /* renamed from: b */
    public static void m98971b(String str) {
        C32458a.m75141a(6, "Tools-Client", str);
        C45408az.m98974a(6, "Tools-Client", str);
        C47061b.m102186d(C47060a.f118841a, str);
    }
}
