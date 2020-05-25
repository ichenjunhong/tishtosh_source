package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.y */
public final /* synthetic */ class C5033y implements C1710e {

    /* renamed from: a */
    private final Handler f13466a;

    public C5033y(Handler handler) {
        this.f13466a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13466a;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(32);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
