package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C14963ax;

@C16299uq
public final class abw extends apf {
    public abw(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C14963ax.m30834d().mo28588a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28621a(Message message) {
        try {
            super.mo28621a(message);
        } catch (Throwable th) {
            acd.m32585a(C14963ax.m30834d().f40166d, th);
            throw th;
        }
    }
}
