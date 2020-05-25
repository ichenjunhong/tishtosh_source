package com.p683ss.android.message;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;

/* renamed from: com.ss.android.message.k */
public class C19487k implements C9382a {

    /* renamed from: c */
    private static C19487k f53816c;

    /* renamed from: a */
    public final Looper f53817a;

    /* renamed from: b */
    public final C9381g f53818b;

    /* renamed from: d */
    private final HandlerThread f53819d = new HandlerThread("PushThreadHandler");

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    public static C19487k m47712a() {
        if (f53816c == null) {
            synchronized (C19487k.class) {
                if (f53816c == null) {
                    f53816c = new C19487k();
                }
            }
        }
        return f53816c;
    }

    private C19487k() {
        this.f53819d.start();
        this.f53817a = this.f53819d.getLooper();
        this.f53818b = new C9381g(this.f53817a, this);
    }

    /* renamed from: a */
    public final void mo40629a(Runnable runnable) {
        mo40630a(runnable, 0);
    }

    /* renamed from: a */
    public final void mo40630a(Runnable runnable, long j) {
        if (j <= 0) {
            this.f53818b.post(runnable);
        } else {
            this.f53818b.postDelayed(runnable, j);
        }
    }
}
