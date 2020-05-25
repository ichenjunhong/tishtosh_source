package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.C5887q.C5888a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.s */
final /* synthetic */ class C5890s implements C1710e {

    /* renamed from: a */
    private final C5887q f15410a;

    C5890s(C5887q qVar) {
        this.f15410a = qVar;
    }

    public final void accept(Object obj) {
        C5887q qVar = this.f15410a;
        Throwable th = (Throwable) obj;
        if (qVar.mo8518c() != null) {
            ((C5888a) qVar.mo8518c()).mo11777a(th);
        }
    }
}
