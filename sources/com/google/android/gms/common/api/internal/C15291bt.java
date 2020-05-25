package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15227b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p1033b.C15172a;
import com.google.android.gms.p1033b.C15179g;

/* renamed from: com.google.android.gms.common.api.internal.bt */
public final class C15291bt implements C15172a<Boolean, Void> {
    /* renamed from: a */
    public final /* synthetic */ Object mo27985a(C15179g gVar) throws Exception {
        if (((Boolean) gVar.mo28002d()).booleanValue()) {
            return null;
        }
        throw new C15227b(new Status(13, "listener already unregistered"));
    }
}
