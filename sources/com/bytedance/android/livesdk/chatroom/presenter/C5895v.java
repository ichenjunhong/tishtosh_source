package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.chatroom.presenter.C5891t.C5893a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7505d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.v */
final /* synthetic */ class C5895v implements C1710e {

    /* renamed from: a */
    private final C5891t f15422a;

    /* renamed from: b */
    private final C7505d f15423b;

    C5895v(C5891t tVar, C7505d dVar) {
        this.f15422a = tVar;
        this.f15423b = dVar;
    }

    public final void accept(Object obj) {
        C5891t tVar = this.f15422a;
        C7505d dVar = this.f15423b;
        Throwable th = (Throwable) obj;
        tVar.f15413c = false;
        C7647s.m15649a(dVar.f20543d, tVar.f15414d.getId(), th);
        if (dVar != null && dVar.f20539H) {
            C7647s.m15647a(dVar.f20543d, tVar.f15414d.getId(), 1, "fast_gift", th);
        }
        if (tVar.mo8518c() != null) {
            if (th instanceof C2949a) {
                C2949a aVar = (C2949a) th;
                if (40001 == aVar.getErrorCode()) {
                    ((C5893a) tVar.mo8518c()).mo11787a();
                } else {
                    ((C5893a) tVar.mo8518c()).mo11789a(aVar.getPrompt());
                }
            } else {
                ((C5893a) tVar.mo8518c()).mo11792c();
            }
        }
    }
}
