package com.bytedance.ies.dmt.p664ui.p666b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.b.c */
final /* synthetic */ class C10645c implements OnClickListener {

    /* renamed from: a */
    private final C10641a f28297a;

    C10645c(C10641a aVar) {
        this.f28297a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C10641a aVar = this.f28297a;
        if (!aVar.f28246g) {
            C10641a.m21427a(dialogInterface);
        }
        if (aVar.f28243d != null) {
            aVar.f28243d.onClick(dialogInterface, i);
        }
    }
}
