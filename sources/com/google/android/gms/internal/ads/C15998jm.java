package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.jm */
final class C15998jm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C16025km> f45087a = new ArrayList();

    C15998jm() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31116a(C16026kn knVar) {
        Handler handler = acd.f40245a;
        for (C16025km klVar : this.f45087a) {
            handler.post(new C16024kl(this, klVar, knVar));
        }
        this.f45087a.clear();
    }
}
