package com.bytedance.android.livesdk.message.p397b;

import com.bytedance.android.livesdk.message.model.C7859c;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.message.b.c */
public final class C7780c implements IInterceptor {

    /* renamed from: a */
    private long f21390a;

    public C7780c(long j) {
        this.f21390a = j;
    }

    public final boolean onMessage(IMessage iMessage) {
        C7859c cVar = (C7859c) iMessage;
        if (cVar.baseMessage == null || cVar.baseMessage.f24132c == this.f21390a) {
            return false;
        }
        return true;
    }
}
