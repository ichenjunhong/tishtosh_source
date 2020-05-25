package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.presenter.C5793ao.C5795b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ap */
final /* synthetic */ class C5796ap implements C1710e {

    /* renamed from: a */
    private final C5793ao f15246a;

    C5796ap(C5793ao aoVar) {
        this.f15246a = aoVar;
    }

    public final void accept(Object obj) {
        C5793ao aoVar = this.f15246a;
        User user = (User) obj;
        if (aoVar.mo8518c() != null) {
            ((C5795b) aoVar.mo8518c()).mo11683a((C3009i) user);
        }
    }
}
