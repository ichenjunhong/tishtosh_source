package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.z */
final /* synthetic */ class C5034z implements C1710e {

    /* renamed from: a */
    private final Handler f13467a;

    /* renamed from: b */
    private final int f13468b;

    C5034z(Handler handler, int i) {
        this.f13467a = handler;
        this.f13468b = i;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13467a;
        int i = this.f13468b;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
