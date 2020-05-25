package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C15336h;
import com.google.android.gms.location.C16877ah;
import com.google.android.gms.location.C16885d;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.j */
final class C16512j extends C16877ah {

    /* renamed from: a */
    private final C15336h<C16885d> f46401a;

    C16512j(C15336h<C16885d> hVar) {
        this.f46401a = hVar;
    }

    /* renamed from: a */
    public final synchronized void mo31724a() {
        this.f46401a.mo28284a();
    }

    /* renamed from: a */
    public final void mo31725a(LocationAvailability locationAvailability) {
        this.f46401a.mo28285a(new C16514l(this, locationAvailability));
    }

    /* renamed from: a */
    public final void mo31726a(LocationResult locationResult) {
        this.f46401a.mo28285a(new C16513k(this, locationResult));
    }
}
