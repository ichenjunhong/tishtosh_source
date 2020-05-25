package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8068g;

/* renamed from: com.bytedance.android.live.broadcast.preview.bf */
final /* synthetic */ class C3543bf implements OnClickListener {

    /* renamed from: a */
    private final C3514al f10100a;

    C3543bf(C3514al alVar) {
        this.f10100a = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3514al alVar = this.f10100a;
        C8068g.m16014a((Context) alVar.f10047b);
        alVar.f10062q.dismiss();
    }
}
