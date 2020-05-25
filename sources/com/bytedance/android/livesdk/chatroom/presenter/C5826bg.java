package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.event.C5163ai;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bg */
final /* synthetic */ class C5826bg implements C1710e {

    /* renamed from: a */
    private final C5821bf f15286a;

    C5826bg(C5821bf bfVar) {
        this.f15286a = bfVar;
    }

    public final void accept(Object obj) {
        this.f15286a.onEvent((C5163ai) obj);
    }
}
