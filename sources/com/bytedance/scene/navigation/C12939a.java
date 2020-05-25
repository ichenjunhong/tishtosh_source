package com.bytedance.scene.navigation;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bytedance.scene.navigation.a */
final class C12939a extends Handler {

    /* renamed from: a */
    private boolean f33886a = true;

    /* renamed from: a */
    public final void mo24515a(Runnable runnable) {
        Message obtain = Message.obtain(this, runnable);
        if (this.f33886a) {
            obtain.setAsynchronous(true);
        }
        sendMessage(obtain);
    }

    C12939a(Looper looper) {
        super(looper);
        if (VERSION.SDK_INT < 16) {
            this.f33886a = false;
            return;
        }
        if (this.f33886a && VERSION.SDK_INT < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                this.f33886a = false;
            }
            obtain.recycle();
        }
    }
}
