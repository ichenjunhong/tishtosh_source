package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import dmt.p2652av.video.C53024t;

/* renamed from: com.ss.android.ugc.aweme.effect.bg */
final /* synthetic */ class C29147bg implements C0199s {

    /* renamed from: a */
    private final C29094ad f76394a;

    C29147bg(C29094ad adVar) {
        this.f76394a = adVar;
    }

    public final void onChanged(Object obj) {
        C29094ad adVar = this.f76394a;
        C53024t tVar = (C53024t) obj;
        if (tVar != null && tVar.f131486c == 0 && !TextUtils.isEmpty(tVar.f131484a) && tVar.f131485b > 0) {
            CharSequence charSequence = tVar.f131484a;
            long j = tVar.f131485b;
            if (adVar.f76304k != null) {
                adVar.f76304k.setVisibility(0);
                adVar.f76304k.postDelayed(new C29148bh(adVar), j);
            }
            if (adVar.f76305l != null) {
                adVar.f76305l.setText(charSequence);
            }
        }
    }
}
