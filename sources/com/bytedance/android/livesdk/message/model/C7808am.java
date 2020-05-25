package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;

/* renamed from: com.bytedance.android.livesdk.message.model.am */
public final class C7808am extends C7859c {

    /* renamed from: a */
    public User f21485a;

    /* renamed from: b */
    public long f21486b;

    /* renamed from: c */
    public String f21487c;

    /* renamed from: d */
    public long f21488d;

    public final boolean canText() {
        return true;
    }

    public C7808am() {
        this.type = C8629a.GIFT_GROUP;
    }

    public final boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }

    public final boolean isCurrentRoom(long j) {
        if (this.f21488d == j) {
            return true;
        }
        return false;
    }
}
