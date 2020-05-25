package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ap */
final /* synthetic */ class C6454ap implements C1710e {

    /* renamed from: a */
    private final GiftWidget f17759a;

    C6454ap(GiftWidget giftWidget) {
        this.f17759a = giftWidget;
    }

    public final void accept(Object obj) {
        GiftWidget giftWidget = this.f17759a;
        C4632d dVar = (C4632d) obj;
        if (giftWidget.f17033d != null) {
            giftWidget.f17033d.mo12549a(dVar);
        }
    }
}
