package com.p683ss.android.account;

import com.bytedance.sdk.account.p878m.C13209b;
import com.p683ss.android.C18843c;
import com.p683ss.android.C18923d;
import com.p683ss.android.account.p1100a.p1101a.C18491a;

/* renamed from: com.ss.android.account.c */
public final class C18495c {

    /* renamed from: a */
    public static volatile C18843c f50958a;

    /* renamed from: b */
    public static volatile C18491a f50959b;

    /* renamed from: c */
    private static volatile C18923d f50960c;

    /* renamed from: d */
    private static volatile C13209b f50961d;

    /* renamed from: b */
    public static C18923d m44743b() {
        return f50960c;
    }

    /* renamed from: c */
    public static C18491a m44744c() {
        return f50959b;
    }

    /* renamed from: d */
    public static C13209b m44745d() {
        return f50961d;
    }

    /* renamed from: a */
    public static C18843c m44742a() {
        if (f50958a != null) {
            return f50958a;
        }
        throw new IllegalStateException("not init TTAccount config");
    }
}
