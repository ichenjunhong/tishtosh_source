package com.p683ss.android.ugc.aweme.effect;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.effect.ax */
final /* synthetic */ class C29122ax implements OnClickListener {

    /* renamed from: a */
    private final C29094ad f76350a;

    C29122ax(C29094ad adVar) {
        this.f76350a = adVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C29094ad adVar = this.f76350a;
        dialogInterface.dismiss();
        adVar.f76276L = 1;
        adVar.mo58954b();
        adVar.mo58971k();
    }
}
