package com.p683ss.android.ugc.aweme.base.p1420ui.session;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.Session$1 */
class Session$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C23706b f63222a;

    /* renamed from: b */
    final /* synthetic */ C23705a f63223b;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        C23705a aVar = this.f63223b;
        aVar.f63225a.remove(this.f63222a);
    }

    Session$1(C23705a aVar, C23706b bVar) {
        this.f63223b = aVar;
        this.f63222a = bVar;
    }
}
