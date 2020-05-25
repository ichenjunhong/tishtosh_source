package com.bytedance.android.live.broadcast.p203e;

import android.os.Message;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.e.f */
final /* synthetic */ class C3193f implements C1710e {

    /* renamed from: a */
    private final C3187a f9254a;

    C3193f(C3187a aVar) {
        this.f9254a = aVar;
    }

    public final void accept(Object obj) {
        C3187a aVar = this.f9254a;
        C4177d dVar = (C4177d) obj;
        if (aVar.f9241c != null) {
            Message obtainMessage = aVar.f9241c.obtainMessage(34);
            obtainMessage.obj = dVar.data;
            aVar.f9241c.sendMessage(obtainMessage);
        }
    }
}
