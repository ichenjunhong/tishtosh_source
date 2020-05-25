package com.bytedance.android.livesdk.feed.roomdetector;

import android.os.Message;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.roomdetector.d */
final /* synthetic */ class C7094d implements C1710e {

    /* renamed from: a */
    private final C7091b f19305a;

    C7094d(C7091b bVar) {
        this.f19305a = bVar;
    }

    public final void accept(Object obj) {
        C7091b bVar = this.f19305a;
        Throwable th = (Throwable) obj;
        if (bVar.f19295a != null) {
            Message obtainMessage = bVar.f19295a.obtainMessage(7);
            obtainMessage.obj = th;
            bVar.f19295a.sendMessage(obtainMessage);
        }
    }
}
