package com.bytedance.android.live.broadcast.dutygift;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p194a.C3034a.C3035a;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.dutygift.g */
final /* synthetic */ class C3178g implements C1710e {

    /* renamed from: a */
    private final C3177f f9225a;

    C3178g(C3177f fVar) {
        this.f9225a = fVar;
    }

    public final void accept(Object obj) {
        ((C3035a) this.f9225a.mo8518c()).mo8248a((DutyGiftInfo) ((C4177d) obj).data);
    }
}
