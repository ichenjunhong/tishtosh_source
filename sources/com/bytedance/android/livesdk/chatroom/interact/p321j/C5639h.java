package com.bytedance.android.livesdk.chatroom.interact.p321j;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.j.h */
final /* synthetic */ class C5639h implements C1710e {

    /* renamed from: a */
    private final C5630a f14774a;

    /* renamed from: b */
    private final boolean f14775b;

    C5639h(C5630a aVar, boolean z) {
        this.f14774a = aVar;
        this.f14775b = z;
    }

    public final void accept(Object obj) {
        C5630a aVar = this.f14774a;
        boolean z = this.f14775b;
        C4176c cVar = (C4176c) obj;
        aVar.f14753a = false;
        List<C5696e> list = cVar.f11365b;
        if (list.isEmpty()) {
            aVar.f14761i.clear();
        } else {
            aVar.f14761i = list;
        }
        if (z) {
            aVar.mo11518a(aVar.f14761i);
        }
        for (C5631a b : aVar.f14758f) {
            b.mo11126b(aVar.f14761i);
        }
    }
}
