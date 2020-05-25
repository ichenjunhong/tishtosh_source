package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.C15106a;
import com.google.android.gms.auth.api.signin.C15137a;
import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15237g;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
public final class C15151f implements C15137a {
    /* renamed from: a */
    public final Intent mo27932a(C15233f fVar) {
        return C15153h.m31346a(fVar.mo28104b(), ((C15152g) fVar.mo28096a((C15214c<C>) C15106a.f39003b)).f39191a);
    }

    /* renamed from: b */
    public final C15237g<Status> mo27933b(C15233f fVar) {
        C15153h.m31347a(fVar.mo28104b());
        return fVar.mo28097a(new C15154i(fVar));
    }

    /* renamed from: c */
    public final C15237g<Status> mo27934c(C15233f fVar) {
        Context b = fVar.mo28104b();
        C15147b.m31320a(b).mo27952a("refreshToken");
        C15153h.m31347a(b);
        return fVar.mo28097a(new C15156k(fVar));
    }
}
