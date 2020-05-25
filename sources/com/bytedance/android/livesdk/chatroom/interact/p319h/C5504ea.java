package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ea */
final /* synthetic */ class C5504ea implements C1710e {

    /* renamed from: a */
    private final C54722 f14536a;

    C5504ea(C54722 r1) {
        this.f14536a = r1;
    }

    public final void accept(Object obj) {
        C54722 r0 = this.f14536a;
        Integer num = (Integer) obj;
        if (num.equals(Integer.valueOf(2))) {
            ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).init();
            C5470cy.this.mo11380m();
        } else if (num.equals(Integer.valueOf(1))) {
            C4575an.m10981a((int) R.string.f0e);
        } else {
            C4575an.m10981a((int) R.string.f0d);
        }
    }
}
