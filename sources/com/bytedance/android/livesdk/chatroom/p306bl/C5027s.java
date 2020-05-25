package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.s */
final /* synthetic */ class C5027s implements C1710e {

    /* renamed from: a */
    private final Handler f13460a;

    C5027s(Handler handler) {
        this.f13460a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13460a;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
