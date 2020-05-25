package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.u */
public final /* synthetic */ class C5029u implements C1710e {

    /* renamed from: a */
    private final Handler f13462a;

    public C5029u(Handler handler) {
        this.f13462a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13462a;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
