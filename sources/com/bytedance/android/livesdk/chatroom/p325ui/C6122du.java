package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.live.base.model.user.User;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.du */
final /* synthetic */ class C6122du implements C1710e {

    /* renamed from: a */
    private final C6118ds f16428a;

    C6122du(C6118ds dsVar) {
        this.f16428a = dsVar;
    }

    public final void accept(Object obj) {
        C6118ds dsVar = this.f16428a;
        dsVar.f16401c = ((User) obj).isFollowing();
        dsVar.f16403e.setVisibility(dsVar.f16401c ? 8 : 0);
    }
}
