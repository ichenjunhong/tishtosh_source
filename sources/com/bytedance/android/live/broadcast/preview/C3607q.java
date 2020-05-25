package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.p279af.C4602l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.q */
final /* synthetic */ class C3607q implements C1710e {

    /* renamed from: a */
    private final C3589i f10286a;

    C3607q(C3589i iVar) {
        this.f10286a = iVar;
    }

    public final void accept(Object obj) {
        C3589i iVar = this.f10286a;
        Throwable th = (Throwable) obj;
        C3831a.m9706a(6, "StartLiveFragmentC", th.getStackTrace());
        C4602l.m11046a(iVar.getContext(), th);
    }
}
