package com.p683ss.android.ugc.aweme.effect;

import android.view.KeyEvent;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;

/* renamed from: com.ss.android.ugc.aweme.effect.ae */
final /* synthetic */ class C29103ae implements C50206a {

    /* renamed from: a */
    private final C29094ad f76331a;

    C29103ae(C29094ad adVar) {
        this.f76331a = adVar;
    }

    /* renamed from: a */
    public final boolean mo58985a(int i, KeyEvent keyEvent) {
        C29094ad adVar = this.f76331a;
        if (i != 4 || !adVar.f76268D) {
            return false;
        }
        if (adVar.f76307n != null) {
            adVar.f76307n.performClick();
        }
        return true;
    }
}
