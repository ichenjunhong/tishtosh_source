package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.effect.p1673c.C29163a;

/* renamed from: com.ss.android.ugc.aweme.effect.bd */
final /* synthetic */ class C29144bd implements C0199s {

    /* renamed from: a */
    private final C29094ad f76391a;

    C29144bd(C29094ad adVar) {
        this.f76391a = adVar;
    }

    public final void onChanged(Object obj) {
        C29094ad adVar = this.f76391a;
        Boolean bool = (Boolean) obj;
        if (adVar.f76314u != null && bool != null) {
            adVar.f76314u.mo58929a(bool.booleanValue());
            C29163a aVar = adVar.f76272H;
            int k = adVar.f76313t.mo43071k();
            int A = adVar.f76313t.mo42966A();
            if (aVar.mo59036a() > 0) {
                aVar.f76421a = ((long) k) - aVar.mo59036a();
            }
            if (aVar.f76422b > 0) {
                aVar.f76422b = ((long) A) - aVar.f76422b;
            }
        }
    }
}
