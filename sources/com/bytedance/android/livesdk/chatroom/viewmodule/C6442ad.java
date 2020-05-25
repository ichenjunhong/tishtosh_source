package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.event.C5174at;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ad */
final /* synthetic */ class C6442ad implements C1710e {

    /* renamed from: a */
    private final DecorationWrapperWidget f17740a;

    C6442ad(DecorationWrapperWidget decorationWrapperWidget) {
        this.f17740a = decorationWrapperWidget;
    }

    public final void accept(Object obj) {
        this.f17740a.onEvent((C5174at) obj);
    }
}
