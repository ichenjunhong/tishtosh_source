package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.internal.C15428c.C15429a;

/* renamed from: com.google.android.gms.common.internal.x */
final class C15474x implements C15429a {

    /* renamed from: a */
    private final /* synthetic */ C15235b f39881a;

    C15474x(C15235b bVar) {
        this.f39881a = bVar;
    }

    /* renamed from: a */
    public final void mo28417a(Bundle bundle) {
        this.f39881a.onConnected(bundle);
    }

    /* renamed from: a */
    public final void mo28416a(int i) {
        this.f39881a.onConnectionSuspended(i);
    }
}
