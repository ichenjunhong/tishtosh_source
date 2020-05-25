package com.bytedance.android.livesdk.feed.roomdetector;

import android.os.Message;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.roomdetector.c */
final /* synthetic */ class C7093c implements C1710e {

    /* renamed from: a */
    private final C7091b f19304a;

    C7093c(C7091b bVar) {
        this.f19304a = bVar;
    }

    public final void accept(Object obj) {
        C7091b bVar = this.f19304a;
        C4177d dVar = (C4177d) obj;
        if (bVar.f19295a != null) {
            Message obtainMessage = bVar.f19295a.obtainMessage(7);
            obtainMessage.obj = dVar.data;
            bVar.f19295a.sendMessage(obtainMessage);
        }
    }
}
