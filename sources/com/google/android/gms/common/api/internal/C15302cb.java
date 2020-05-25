package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15237g.C15238a;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15298c.C15299a;
import com.google.android.gms.common.api.internal.C15328d.C15329a;

/* renamed from: com.google.android.gms.common.api.internal.cb */
public final class C15302cb<A extends C15299a<? extends C15358j, C15213b>> extends C15260aq {

    /* renamed from: a */
    private final A f39482a;

    public C15302cb(int i, A a) {
        super(i);
        this.f39482a = a;
    }

    /* renamed from: a */
    public final void mo28177a(C15329a<?> aVar) throws DeadObjectException {
        try {
            this.f39482a.mo28230b(aVar.f39584a);
        } catch (RuntimeException e) {
            mo28179a(e);
        }
    }

    /* renamed from: a */
    public final void mo28176a(Status status) {
        this.f39482a.mo28229b(status);
    }

    /* renamed from: a */
    public final void mo28179a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f39482a.mo28229b(new Status(10, sb.toString()));
    }

    /* renamed from: a */
    public final void mo28178a(C15349r rVar, boolean z) {
        A a = this.f39482a;
        rVar.f39630a.put(a, Boolean.valueOf(z));
        a.mo28122a((C15238a) new C15350s(rVar, a));
    }
}
