package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.event.C5166al;
import com.bytedance.android.livesdk.chatroom.event.C5167am;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.presenter.C5807b.C5809a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.f */
final /* synthetic */ class C5871f implements C1710e {

    /* renamed from: a */
    private final C5807b f15372a;

    /* renamed from: b */
    private final C5166al f15373b;

    C5871f(C5807b bVar, C5166al alVar) {
        this.f15372a = bVar;
        this.f15373b = alVar;
    }

    public final void accept(Object obj) {
        C5807b bVar = this.f15372a;
        C4177d dVar = (C4177d) obj;
        C4495a.m10823a().mo10301a((Object) new C5167am(this.f15373b, true));
        bVar.f15257a = true;
        if (bVar.mo8518c() != null) {
            ((C5809a) bVar.mo8518c()).mo11690a((Barrage) dVar.data);
        }
    }
}
