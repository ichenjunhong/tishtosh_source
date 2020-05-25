package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.C5793ao.C5795b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.aw */
final /* synthetic */ class C5803aw implements C1710e {

    /* renamed from: a */
    private final C5793ao f15253a;

    C5803aw(C5793ao aoVar) {
        this.f15253a = aoVar;
    }

    public final void accept(Object obj) {
        C5793ao aoVar = this.f15253a;
        Throwable th = (Throwable) obj;
        aoVar.f15239c = false;
        if (aoVar.mo8518c() != null) {
            ((C5795b) aoVar.mo8518c()).mo11686b(th);
        }
    }
}
