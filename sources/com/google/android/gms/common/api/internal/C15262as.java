package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.p1042c.C16478e;

/* renamed from: com.google.android.gms.common.api.internal.as */
final class C15262as extends C16478e {

    /* renamed from: a */
    private final /* synthetic */ C15256am f39408a;

    C15262as(C15256am amVar, Looper looper) {
        this.f39408a = amVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                C15256am amVar = this.f39408a;
                amVar.f39373a.lock();
                try {
                    if (amVar.mo28173m()) {
                        amVar.mo28172l();
                    }
                    return;
                } finally {
                    amVar.f39373a.unlock();
                }
            case 2:
                C15256am.m31590a(this.f39408a);
                return;
            default:
                return;
        }
    }
}
