package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.live.broadcast.preview.ah */
final /* synthetic */ class C3510ah implements OnClickListener {

    /* renamed from: a */
    private final C3589i f10000a;

    C3510ah(C3589i iVar) {
        this.f10000a = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3589i iVar = this.f10000a;
        dialogInterface.dismiss();
        if (iVar.f10253k != null) {
            iVar.f10253k.mo9151b();
        }
    }
}
