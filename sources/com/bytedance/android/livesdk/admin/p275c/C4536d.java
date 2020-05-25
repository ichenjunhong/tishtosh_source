package com.bytedance.android.livesdk.admin.p275c;

import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.livesdk.admin.p274b.C4530a;
import com.bytedance.android.livesdk.admin.p274b.C4532c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.admin.c.d */
final /* synthetic */ class C4536d implements C1710e {

    /* renamed from: a */
    private final C4533a f12476a;

    C4536d(C4533a aVar) {
        this.f12476a = aVar;
    }

    public final void accept(Object obj) {
        C4533a aVar = this.f12476a;
        C4172a aVar2 = (C4172a) obj;
        C4532c cVar = new C4532c();
        cVar.f12466a = aVar2.f11365b;
        cVar.f12467b = (aVar2.f11366c == null || ((C4530a) aVar2.f11366c).f12463a <= 0) ? 10 : ((C4530a) aVar2.f11366c).f12463a;
        cVar.f12468c = aVar2.f11365b != null ? aVar2.f11365b.size() : 0;
        aVar.f12469a.mo10360a(cVar, (Exception) null);
    }
}
