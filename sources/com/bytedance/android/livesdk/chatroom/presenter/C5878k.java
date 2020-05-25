package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5754k;
import com.bytedance.android.livesdk.chatroom.presenter.C5876j.C5877a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.k */
public final /* synthetic */ class C5878k implements C1710e {

    /* renamed from: a */
    private final C5876j f15390a;

    public C5878k(C5876j jVar) {
        this.f15390a = jVar;
    }

    public final void accept(Object obj) {
        C5754k kVar = (C5754k) ((C4177d) obj).data;
        ((C5877a) this.f15390a.mo8518c()).mo11759a(kVar);
    }
}
