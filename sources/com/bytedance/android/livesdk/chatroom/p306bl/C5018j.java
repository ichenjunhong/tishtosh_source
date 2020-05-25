package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.rank.C8212l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.j */
final /* synthetic */ class C5018j implements C1710e {

    /* renamed from: a */
    private final Handler f13442a;

    /* renamed from: b */
    private final int f13443b;

    /* renamed from: c */
    private final int f13444c;

    C5018j(Handler handler, int i, int i2) {
        this.f13442a = handler;
        this.f13443b = i;
        this.f13444c = i2;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13442a;
        int i = this.f13443b;
        int i2 = this.f13444c;
        C4175b bVar = (C4175b) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
            C8212l.m16285a(i, bVar, i2);
        }
    }
}
