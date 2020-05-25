package com.bytedance.crash.p553l;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.crash.C9616k;

/* renamed from: com.bytedance.crash.l.c */
public final class C9665c extends C9663a {
    public final void run() {
        String c = C9616k.m19147a().mo17448c();
        if (TextUtils.isEmpty(c) || "0".equals(c)) {
            mo17513a(this.f26373c);
            return;
        }
        C9616k.m19151c().mo17508a(c);
        new StringBuilder("[DeviceIdTask] did is ").append(c);
    }

    C9665c(Handler handler, long j, long j2) {
        super(handler, 0, 15000);
    }
}
