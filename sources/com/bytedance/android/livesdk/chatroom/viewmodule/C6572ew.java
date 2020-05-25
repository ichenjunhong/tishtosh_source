package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.event.C5180az;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ew */
final /* synthetic */ class C6572ew implements C1710e {

    /* renamed from: a */
    private final TopHourRankWidget f17906a;

    C6572ew(TopHourRankWidget topHourRankWidget) {
        this.f17906a = topHourRankWidget;
    }

    public final void accept(Object obj) {
        this.f17906a.onEvent((C5180az) obj);
    }
}
