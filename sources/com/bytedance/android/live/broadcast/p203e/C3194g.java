package com.bytedance.android.live.broadcast.p203e;

import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.e.g */
final /* synthetic */ class C3194g implements C1710e {

    /* renamed from: a */
    private final C3187a f9255a;

    C3194g(C3187a aVar) {
        this.f9255a = aVar;
    }

    public final void accept(Object obj) {
        C3187a aVar = this.f9255a;
        Throwable th = (Throwable) obj;
        if (aVar.f9241c != null) {
            Message obtainMessage = aVar.f9241c.obtainMessage(34);
            obtainMessage.obj = th;
            aVar.f9241c.sendMessage(obtainMessage);
        }
    }
}
