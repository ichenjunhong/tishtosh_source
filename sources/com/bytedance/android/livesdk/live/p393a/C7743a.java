package com.bytedance.android.livesdk.live.p393a;

import android.os.SystemClock;

/* renamed from: com.bytedance.android.livesdk.live.a.a */
public final class C7743a {

    /* renamed from: a */
    public final String f21289a;

    /* renamed from: b */
    private final long f21290b = SystemClock.elapsedRealtime();

    /* renamed from: a */
    public final long mo14093a() {
        return SystemClock.elapsedRealtime() - this.f21290b;
    }

    public C7743a(String str) {
        this.f21289a = str;
    }
}
