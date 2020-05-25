package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.event.C5166al;
import com.bytedance.android.livesdk.chatroom.event.C5168an;
import com.bytedance.android.livesdk.chatroom.event.C5195o;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.c */
final /* synthetic */ class C5849c implements C1710e {

    /* renamed from: a */
    private final C5807b f15317a;

    C5849c(C5807b bVar) {
        this.f15317a = bVar;
    }

    public final void accept(Object obj) {
        C5807b bVar = this.f15317a;
        C5195o oVar = (C5195o) obj;
        if (!(bVar.mo8518c() == null || oVar == null)) {
            if (oVar instanceof C5168an) {
                bVar.mo11688a((C5168an) oVar);
            } else if (oVar instanceof C5166al) {
                bVar.mo11687a((C5166al) oVar);
            }
        }
    }
}
