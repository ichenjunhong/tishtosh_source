package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.rank.C8212l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.m */
final /* synthetic */ class C5021m implements C1710e {

    /* renamed from: a */
    private final Handler f13450a;

    /* renamed from: b */
    private final int f13451b;

    C5021m(Handler handler, int i) {
        this.f13450a = handler;
        this.f13451b = i;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13450a;
        int i = this.f13451b;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(24);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
            C8212l.m16286a(i, th);
        }
    }
}
