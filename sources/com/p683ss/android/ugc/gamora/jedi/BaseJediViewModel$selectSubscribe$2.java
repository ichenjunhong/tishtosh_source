package com.p683ss.android.ugc.gamora.jedi;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$selectSubscribe$2 */
public final class BaseJediViewModel$selectSubscribe$2 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C1690c f124301a;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f124301a.isDisposed()) {
            this.f124301a.dispose();
        }
    }

    BaseJediViewModel$selectSubscribe$2(C1690c cVar) {
        this.f124301a = cVar;
    }
}
