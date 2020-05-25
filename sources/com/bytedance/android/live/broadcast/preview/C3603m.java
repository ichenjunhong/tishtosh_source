package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8068g;

/* renamed from: com.bytedance.android.live.broadcast.preview.m */
final /* synthetic */ class C3603m implements OnClickListener {

    /* renamed from: a */
    private final C3589i f10282a;

    C3603m(C3589i iVar) {
        this.f10282a = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3589i iVar = this.f10282a;
        C8068g.m16014a((Context) iVar.f10244b);
        iVar.f10262t.dismiss();
    }
}
