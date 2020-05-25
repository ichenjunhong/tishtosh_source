package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.w */
public final /* synthetic */ class C5031w implements C1710e {

    /* renamed from: a */
    private final Handler f13464a;

    public C5031w(Handler handler) {
        this.f13464a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13464a;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(30);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
