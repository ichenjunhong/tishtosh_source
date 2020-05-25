package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fn */
final /* synthetic */ class C5552fn implements C1710e {

    /* renamed from: a */
    private final C55322 f14608a;

    C5552fn(C55322 r1) {
        this.f14608a = r1;
    }

    public final void accept(Object obj) {
        C55322 r0 = this.f14608a;
        Integer num = (Integer) obj;
        if (num.equals(Integer.valueOf(2))) {
            ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).init();
            C5529ew.this.mo11439f();
        } else if (num.equals(Integer.valueOf(1))) {
            C4575an.m10981a((int) R.string.f0e);
        } else {
            C4575an.m10981a((int) R.string.f0d);
        }
    }
}
