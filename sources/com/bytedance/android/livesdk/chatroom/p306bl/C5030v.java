package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.v */
public final /* synthetic */ class C5030v implements C1710e {

    /* renamed from: a */
    private final Handler f13463a;

    public C5030v(Handler handler) {
        this.f13463a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13463a;
        C4177d dVar = (C4177d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(30);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}
