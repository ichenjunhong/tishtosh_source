package com.bytedance.android.livesdk.chatroom;

import android.os.SystemClock;
import com.bytedance.android.live.core.p225d.C3833a;

/* renamed from: com.bytedance.android.livesdk.chatroom.a */
public final class C4962a extends C3833a {

    /* renamed from: a */
    public long f13304a;

    /* renamed from: a */
    public final long mo10722a() {
        long j;
        if (this.f13304a > 0) {
            j = SystemClock.uptimeMillis() - this.f13304a;
        } else {
            j = 0;
        }
        this.f13304a = 0;
        return j;
    }
}
