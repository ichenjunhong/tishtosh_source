package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.p */
public final /* synthetic */ class C5024p implements C1710e {

    /* renamed from: a */
    private final Handler f13456a;

    public C5024p(Handler handler) {
        this.f13456a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13456a;
        C4177d dVar = (C4177d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(36);
            obtainMessage.obj = dVar;
            handler.sendMessage(obtainMessage);
        }
    }
}
