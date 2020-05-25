package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.rank.C8212l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.k */
final /* synthetic */ class C5019k implements C1710e {

    /* renamed from: a */
    private final Handler f13445a;

    /* renamed from: b */
    private final int f13446b;

    /* renamed from: c */
    private final int f13447c;

    C5019k(Handler handler, int i, int i2) {
        this.f13445a = handler;
        this.f13446b = i;
        this.f13447c = i2;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13445a;
        int i = this.f13446b;
        int i2 = this.f13447c;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
            C8212l.m16287a(i, th, i2);
        }
    }
}
