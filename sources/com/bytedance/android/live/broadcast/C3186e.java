package com.bytedance.android.live.broadcast;

import com.bytedance.android.livesdk.p399o.C8064d;
import com.p683ss.avframework.utils.AVLog.ILogFilter;

/* renamed from: com.bytedance.android.live.broadcast.e */
final /* synthetic */ class C3186e implements ILogFilter {

    /* renamed from: a */
    private final C8064d f9236a;

    /* renamed from: b */
    private final String f9237b;

    C3186e(C8064d dVar, String str) {
        this.f9236a = dVar;
        this.f9237b = str;
    }

    public final void print(int i, String str, String str2, Throwable th) {
        C3134c.m8708a(this.f9236a, this.f9237b, i, str, str2, th);
    }
}
