package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.rank.C8212l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.o */
public final /* synthetic */ class C5023o implements C1710e {

    /* renamed from: a */
    private final Handler f13454a;

    /* renamed from: b */
    private final int f13455b;

    public C5023o(Handler handler, int i) {
        this.f13454a = handler;
        this.f13455b = i;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13454a;
        int i = this.f13455b;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(31);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
            C8212l.m16286a(i, th);
        }
    }
}
