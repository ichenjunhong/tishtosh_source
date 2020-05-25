package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.rank.C8212l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.l */
final /* synthetic */ class C5020l implements C1710e {

    /* renamed from: a */
    private final Handler f13448a;

    /* renamed from: b */
    private final int f13449b;

    C5020l(Handler handler, int i) {
        this.f13448a = handler;
        this.f13449b = i;
    }

    public final void accept(Object obj) {
        Handler handler = this.f13448a;
        int i = this.f13449b;
        C4175b bVar = (C4175b) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(24);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
            C8212l.m16284a(i, bVar);
        }
    }
}
