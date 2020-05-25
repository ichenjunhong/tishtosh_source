package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew.C5534b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fe */
final /* synthetic */ class C5543fe implements C1710e {

    /* renamed from: a */
    private final C5529ew f14599a;

    C5543fe(C5529ew ewVar) {
        this.f14599a = ewVar;
    }

    public final void accept(Object obj) {
        C5529ew ewVar = this.f14599a;
        Throwable th = (Throwable) obj;
        ewVar.mo11751c(th);
        ewVar.f14577d = false;
        if (!(th instanceof C2949a) || ((C2949a) th).getErrorCode() != 40001) {
            ((C5534b) ewVar.mo8518c()).mo11087c(th);
            return;
        }
        ((C5534b) ewVar.mo8518c()).mo11090f();
        ewVar.mo11445l();
    }
}
