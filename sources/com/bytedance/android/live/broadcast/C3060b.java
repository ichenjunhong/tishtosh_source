package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.p224c.C3831a;
import com.p683ss.avframework.utils.EarlyAVLog.IEarlyLogPrint;

/* renamed from: com.bytedance.android.live.broadcast.b */
final /* synthetic */ class C3060b implements IEarlyLogPrint {

    /* renamed from: a */
    static final IEarlyLogPrint f8938a = new C3060b();

    private C3060b() {
    }

    public final void print(int i, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("code:");
        sb.append(i);
        sb.append(" var2:");
        sb.append(str);
        sb.append(" var3:");
        sb.append(str2);
        C3831a.m9713b("LiveBroadcastContext", sb.toString(), th);
    }
}
