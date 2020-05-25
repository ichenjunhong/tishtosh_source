package com.p683ss.android.account;

import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12995g;

/* renamed from: com.ss.android.account.d */
public abstract class C18496d extends C12989a<C12995g> {
    /* renamed from: a */
    public abstract void mo37744a(C12995g gVar);

    /* renamed from: a */
    public abstract void mo37745a(C12995g gVar, String str, String str2, String str3);

    /* renamed from: b */
    public abstract void mo37746b(C12995g gVar);

    public /* synthetic */ void onResponse(C12990b bVar) {
        C12995g gVar = (C12995g) bVar;
        if (gVar.f33998a) {
            mo37746b(gVar);
        } else if (!gVar.mo24592a()) {
            mo37744a(gVar);
        } else if (gVar.f34012k != null) {
            mo37745a(gVar, gVar.f34010i, gVar.f34011j, gVar.f34012k);
        } else {
            mo37744a(gVar);
        }
    }
}
