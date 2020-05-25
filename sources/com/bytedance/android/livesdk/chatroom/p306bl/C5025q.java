package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4178e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.q */
final /* synthetic */ class C5025q implements C1710e {

    /* renamed from: a */
    private final Handler f13457a;

    /* renamed from: b */
    private final int f13458b;

    C5025q(Handler handler, int i) {
        this.f13457a = handler;
        this.f13458b = i;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13457a;
        int i = this.f13458b;
        C4178e eVar = (C4178e) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = (Room) eVar.f11376b;
            handler.sendMessage(obtainMessage);
        }
    }
}
