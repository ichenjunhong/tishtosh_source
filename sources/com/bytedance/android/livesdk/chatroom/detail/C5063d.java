package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.d */
final /* synthetic */ class C5063d implements C1710e {

    /* renamed from: a */
    private final C5060b f13544a;

    C5063d(C5060b bVar) {
        this.f13544a = bVar;
    }

    public final void accept(Object obj) {
        C5060b bVar = this.f13544a;
        Throwable th = (Throwable) obj;
        if (bVar.f13540b) {
            if (th instanceof C2949a) {
                C2949a aVar = (C2949a) th;
                bVar.mo10933a(aVar.getErrorCode(), aVar.getErrorMsg());
                return;
            }
            bVar.mo10933a(0, th.toString());
        }
    }
}
