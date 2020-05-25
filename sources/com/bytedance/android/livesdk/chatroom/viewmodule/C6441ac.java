package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.event.C5164aj;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ac */
final /* synthetic */ class C6441ac implements C1710e {

    /* renamed from: a */
    private final DecorationWrapperWidget f17739a;

    C6441ac(DecorationWrapperWidget decorationWrapperWidget) {
        this.f17739a = decorationWrapperWidget;
    }

    public final void accept(Object obj) {
        this.f17739a.onEvent((C5164aj) obj);
    }
}
