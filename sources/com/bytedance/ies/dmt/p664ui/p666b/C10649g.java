package com.bytedance.ies.dmt.p664ui.p666b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.b.g */
final /* synthetic */ class C10649g implements OnClickListener {

    /* renamed from: a */
    private final C10641a f28301a;

    C10649g(C10641a aVar) {
        this.f28301a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C10641a aVar = this.f28301a;
        if (!aVar.f28245f) {
            C10641a.m21427a(dialogInterface);
        }
        if (aVar.f28242c != null) {
            aVar.f28242c.onClick(dialogInterface, i);
        }
    }
}
