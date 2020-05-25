package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5772z;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ed */
final /* synthetic */ class C6132ed implements C1710e {

    /* renamed from: a */
    private final C6118ds f16439a;

    C6132ed(C6118ds dsVar) {
        this.f16439a = dsVar;
    }

    public final void accept(Object obj) {
        C6118ds dsVar = this.f16439a;
        C4177d dVar = (C4177d) obj;
        dsVar.mo12156c();
        if (((C5772z) dVar.data).f15213b) {
            dsVar.mo12154a(true);
        } else if (((C5772z) dVar.data).f15212a) {
            dsVar.mo12155b();
        } else {
            dsVar.mo12154a(false);
        }
    }
}
