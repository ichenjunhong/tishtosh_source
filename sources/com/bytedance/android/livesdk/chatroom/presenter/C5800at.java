package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.C5793ao.C5795b;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.at */
final /* synthetic */ class C5800at implements C1710e {

    /* renamed from: a */
    private final C5793ao f15250a;

    C5800at(C5793ao aoVar) {
        this.f15250a = aoVar;
    }

    public final void accept(Object obj) {
        C5793ao aoVar = this.f15250a;
        aoVar.f15240d.addAll((List) obj);
        if (aoVar.mo8518c() != null) {
            ((C5795b) aoVar.mo8518c()).mo11685a(aoVar.f15240d);
        }
    }
}
