package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5715ah;
import com.bytedance.android.livesdk.chatroom.presenter.C5839bt.C5840a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bu */
final /* synthetic */ class C5841bu implements C1710e {

    /* renamed from: a */
    private final C5839bt f15304a;

    /* renamed from: b */
    private final boolean f15305b;

    C5841bu(C5839bt btVar, boolean z) {
        this.f15304a = btVar;
        this.f15305b = z;
    }

    public final void accept(Object obj) {
        C5839bt btVar = this.f15304a;
        boolean z = this.f15305b;
        C4177d dVar = (C4177d) obj;
        C5715ah ahVar = (C5715ah) dVar.data;
        if (ahVar != null && btVar.mo8518c() != null) {
            ((C5840a) btVar.mo8518c()).mo11717a(ahVar, dVar.extra.now, z);
        }
    }
}
