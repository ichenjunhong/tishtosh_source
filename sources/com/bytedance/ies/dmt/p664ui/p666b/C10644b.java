package com.bytedance.ies.dmt.p664ui.p666b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.b.b */
final /* synthetic */ class C10644b implements OnClickListener {

    /* renamed from: a */
    private final C10641a f28296a;

    C10644b(C10641a aVar) {
        this.f28296a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C10641a aVar = this.f28296a;
        if (!aVar.f28244e) {
            C10641a.m21427a(dialogInterface);
        }
        if (aVar.f28241b != null) {
            aVar.f28241b.onClick(dialogInterface, i);
        }
    }
}
