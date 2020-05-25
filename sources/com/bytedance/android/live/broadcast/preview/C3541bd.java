package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.live.broadcast.preview.bd */
final /* synthetic */ class C3541bd implements OnClickListener {

    /* renamed from: a */
    private final C3514al f10098a;

    C3541bd(C3514al alVar) {
        this.f10098a = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3514al alVar = this.f10098a;
        dialogInterface.dismiss();
        if (alVar.f10055j == null) {
            alVar.f10053h.mo9580c();
        }
    }
}
