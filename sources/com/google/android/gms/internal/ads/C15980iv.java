package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C15428c.C15429a;

/* renamed from: com.google.android.gms.internal.ads.iv */
final class C15980iv implements C15429a {

    /* renamed from: a */
    private final /* synthetic */ agl f45080a;

    /* renamed from: b */
    private final /* synthetic */ C15976ir f45081b;

    C15980iv(C15976ir irVar, agl agl) {
        this.f45081b = irVar;
        this.f45080a = agl;
    }

    /* renamed from: a */
    public final void mo28417a(Bundle bundle) {
        try {
            this.f45080a.mo28823b(this.f45081b.f45075a.mo29433s());
        } catch (DeadObjectException e) {
            this.f45080a.mo28822a(e);
        }
    }

    /* renamed from: a */
    public final void mo28416a(int i) {
        agl agl = this.f45080a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        agl.mo28822a(new RuntimeException(sb.toString()));
    }
}
