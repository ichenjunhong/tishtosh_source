package com.bytedance.als;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.support.p030v4.p038f.C0794k;
import java.util.Iterator;

class LiveEvent$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C2767k f8319a;

    /* renamed from: b */
    final /* synthetic */ C2762f f8320b;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        C2762f fVar = this.f8320b;
        F f = this.f8319a;
        fVar.f8326b.remove(f);
        Iterator it = fVar.f8327c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C0794k) it.next()).f2711a == f) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        if (fVar.f8325a != null && !fVar.f8325a.hasObservers()) {
            fVar.f8325a = null;
        }
    }

    LiveEvent$1(C2762f fVar, C2767k kVar) {
        this.f8320b = fVar;
        this.f8319a = kVar;
    }
}
