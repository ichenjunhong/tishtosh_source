package com.bytedance.crash.p553l;

import android.os.Handler;

/* renamed from: com.bytedance.crash.l.a */
public abstract class C9663a implements Runnable {

    /* renamed from: a */
    public Handler f26371a;

    /* renamed from: b */
    public final long f26372b;

    /* renamed from: c */
    public final long f26373c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17513a(long j) {
        if (j > 0) {
            this.f26371a.postDelayed(this, j);
        } else {
            this.f26371a.post(this);
        }
    }

    C9663a(Handler handler, long j, long j2) {
        this.f26371a = handler;
        this.f26372b = j;
        this.f26373c = j2;
    }
}
