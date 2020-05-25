package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15233f.C15235b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.ao */
final class C15258ao implements C15235b {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f39399a;

    /* renamed from: b */
    private final /* synthetic */ C15344m f39400b;

    /* renamed from: c */
    private final /* synthetic */ C15256am f39401c;

    C15258ao(C15256am amVar, AtomicReference atomicReference, C15344m mVar) {
        this.f39401c = amVar;
        this.f39399a = atomicReference;
        this.f39400b = mVar;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        this.f39401c.mo28171a((C15233f) this.f39399a.get(), this.f39400b, true);
    }
}
