package com.bytedance.android.livesdkapi.message;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdkapi.message.a */
public class C8844a {
    @C17952c(mo34828a = "common")
    public C8845b baseMessage;
    public volatile long localTimestamp = SystemClock.elapsedRealtime();
    public transient long timestamp;
    @C17950a
    public C8629a type = C8629a.DEFAULT;

    public boolean canText() {
        return false;
    }

    public C8629a getMessageType() {
        return this.type;
    }

    public boolean isCurrentRoom(long j) {
        long j2;
        if (this.baseMessage != null) {
            j2 = this.baseMessage.f24132c;
        } else {
            j2 = 0;
        }
        if (j == 0 || j != j2) {
            return false;
        }
        return true;
    }
}
