package com.bytedance.android.live.broadcast.p212g;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.g.d */
final /* synthetic */ class C3400d implements C1710e {

    /* renamed from: a */
    private final C3398b f9702a;

    C3400d(C3398b bVar) {
        this.f9702a = bVar;
    }

    public final void accept(Object obj) {
        C3398b bVar = this.f9702a;
        Throwable th = (Throwable) obj;
        if (th instanceof C2949a) {
            bVar.f9698a.mo8470c(((C2949a) th).getErrorCode());
        }
        bVar.f9698a.mo8470c(0);
    }
}
