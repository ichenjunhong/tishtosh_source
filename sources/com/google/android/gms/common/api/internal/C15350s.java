package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15237g.C15238a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.s */
final class C15350s implements C15238a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f39632a;

    /* renamed from: b */
    private final /* synthetic */ C15349r f39633b;

    C15350s(C15349r rVar, BasePendingResult basePendingResult) {
        this.f39633b = rVar;
        this.f39632a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo28126a(Status status) {
        this.f39633b.f39630a.remove(this.f39632a);
    }
}
