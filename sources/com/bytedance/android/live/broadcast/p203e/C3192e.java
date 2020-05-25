package com.bytedance.android.live.broadcast.p203e;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.e.e */
public final /* synthetic */ class C3192e implements C1710e {

    /* renamed from: a */
    private final C3187a f9253a;

    public C3192e(C3187a aVar) {
        this.f9253a = aVar;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.f9253a.f9241c.sendEmptyMessageDelayed(2, 10000);
    }
}
