package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.x */
public final /* synthetic */ class C5032x implements C1710e {

    /* renamed from: a */
    private final Handler f13465a;

    public C5032x(Handler handler) {
        this.f13465a = handler;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13465a;
        C4177d dVar = (C4177d) obj;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(32));
        }
    }
}
