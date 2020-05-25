package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.rank.C8212l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.n */
public final /* synthetic */ class C5022n implements C1710e {

    /* renamed from: a */
    private final Handler f13452a;

    /* renamed from: b */
    private final int f13453b;

    public C5022n(Handler handler, int i) {
        this.f13452a = handler;
        this.f13453b = i;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13452a;
        int i = this.f13453b;
        C4175b bVar = (C4175b) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(31);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
            C8212l.m16284a(i, bVar);
        }
    }
}
