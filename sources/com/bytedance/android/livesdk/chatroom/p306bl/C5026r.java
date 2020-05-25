package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.r */
public final /* synthetic */ class C5026r implements C1710e {

    /* renamed from: a */
    private final Handler f13459a;

    public C5026r(Handler handler) {
        this.f13459a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13459a;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(36);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
