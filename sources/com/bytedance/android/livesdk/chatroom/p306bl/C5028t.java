package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.t */
public final /* synthetic */ class C5028t implements C1710e {

    /* renamed from: a */
    private final Handler f13461a;

    public C5028t(Handler handler) {
        this.f13461a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13461a;
        C4177d dVar = (C4177d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}
