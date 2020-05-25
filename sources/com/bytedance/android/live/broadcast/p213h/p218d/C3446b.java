package com.bytedance.android.live.broadcast.p213h.p218d;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: com.bytedance.android.live.broadcast.h.d.b */
public final class C3446b implements Callback {

    /* renamed from: a */
    public boolean f9858a;

    /* renamed from: b */
    private Handler f9859b;

    /* renamed from: c */
    private final long f9860c;

    /* renamed from: d */
    private C3445a f9861d;

    /* renamed from: e */
    private int f9862e;

    /* renamed from: a */
    public final void mo8841a() {
        if (!this.f9858a) {
            this.f9862e = 2;
            m9287b(0);
            this.f9858a = true;
        }
    }

    public C3446b(C3445a aVar) {
        this(aVar, 0);
    }

    public final boolean handleMessage(Message message) {
        if (102 == message.what) {
            m9287b(0);
        }
        return true;
    }

    /* renamed from: b */
    private void m9287b(int i) {
        this.f9859b.removeMessages(102);
        this.f9861d.mo8751a(this.f9862e, i);
        if (4 != this.f9862e) {
            this.f9859b.sendEmptyMessageDelayed(102, this.f9860c);
        }
    }

    /* renamed from: a */
    public final void mo8842a(int i) {
        if (this.f9858a) {
            this.f9859b.removeMessages(102);
            this.f9858a = false;
            mo8843a(4, i);
        }
    }

    /* renamed from: a */
    public void mo8843a(int i, int i2) {
        this.f9862e = i;
        m9287b(i2);
    }

    private C3446b(C3445a aVar, long j) {
        this.f9862e = 1;
        this.f9859b = new Handler(this);
        this.f9860c = 5000;
        this.f9861d = aVar;
    }
}
