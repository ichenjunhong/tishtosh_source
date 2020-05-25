package com.bytedance.android.live.broadcast.p201c;

import com.bytedance.android.live.broadcast.p201c.C3150a.C3153b;
import com.bytedance.android.live.network.response.C4176c;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.c.c */
final /* synthetic */ class C3156c implements C1710e {

    /* renamed from: a */
    private final C3150a f9189a;

    C3156c(C3150a aVar) {
        this.f9189a = aVar;
    }

    public final void accept(Object obj) {
        C4176c cVar = (C4176c) obj;
        C3153b bVar = this.f9189a.f9175b;
        List list = cVar.f11365b;
        bVar.f9185a.clear();
        if (list != null) {
            bVar.f9185a.addAll(list);
        }
        bVar.notifyDataSetChanged();
    }
}
