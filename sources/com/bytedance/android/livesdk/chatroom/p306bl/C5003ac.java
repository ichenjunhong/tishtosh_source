package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.ac */
final /* synthetic */ class C5003ac implements C1710e {

    /* renamed from: a */
    private final Handler f13409a;

    /* renamed from: b */
    private final int f13410b;

    C5003ac(Handler handler, int i) {
        this.f13409a = handler;
        this.f13410b = i;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13409a;
        int i = this.f13410b;
        C4177d dVar = (C4177d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}
