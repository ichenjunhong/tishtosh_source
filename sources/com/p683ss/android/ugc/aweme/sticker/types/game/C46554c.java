package com.p683ss.android.ugc.aweme.sticker.types.game;

import android.view.KeyEvent;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.c */
final /* synthetic */ class C46554c implements C50206a {

    /* renamed from: a */
    private final C46552b f117461a;

    C46554c(C46552b bVar) {
        this.f117461a = bVar;
    }

    /* renamed from: a */
    public final boolean mo58985a(int i, KeyEvent keyEvent) {
        C46552b bVar = this.f117461a;
        if (!bVar.f117449d || i != 4) {
            return false;
        }
        if (bVar.f117448c) {
            bVar.mo93355f();
        } else {
            bVar.mo93352c();
        }
        return true;
    }
}
