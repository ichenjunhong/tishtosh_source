package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.p1042c.C16478e;

/* renamed from: com.google.android.gms.common.api.internal.ax */
final class C15267ax extends C16478e {

    /* renamed from: a */
    private final /* synthetic */ C15265av f39426a;

    C15267ax(C15265av avVar, Looper looper) {
        this.f39426a = avVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ((C15266aw) message.obj).mo28195a(this.f39426a);
                return;
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                return;
        }
    }
}
