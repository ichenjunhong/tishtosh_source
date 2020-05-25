package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.ad */
final /* synthetic */ class C5004ad implements C1710e {

    /* renamed from: a */
    private final Handler f13411a;

    /* renamed from: b */
    private final int f13412b;

    C5004ad(Handler handler, int i) {
        this.f13411a = handler;
        this.f13412b = i;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13411a;
        int i = this.f13412b;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
