package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15227b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.common.api.internal.o */
public final class C15346o {
    /* renamed from: a */
    public static void m31899a(Status status, C15180h<Void> hVar) {
        if (status.mo28060c()) {
            hVar.mo28005a(null);
        } else {
            hVar.mo28004a((Exception) new C15227b(status));
        }
    }
}
