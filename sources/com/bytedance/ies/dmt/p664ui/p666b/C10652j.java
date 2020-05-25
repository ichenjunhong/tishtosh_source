package com.bytedance.ies.dmt.p664ui.p666b;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.b.j */
final /* synthetic */ class C10652j implements OnClickListener {

    /* renamed from: a */
    private final C10641a f28304a;

    C10652j(C10641a aVar) {
        this.f28304a = aVar;
    }

    public final void onClick(View view) {
        C10641a aVar = this.f28304a;
        if (!aVar.f28246g) {
            C10641a.m21428a(false, aVar.f28219a);
            new Handler().postDelayed(new C10646d(aVar), 100);
        }
        if (aVar.f28243d != null) {
            aVar.f28243d.onClick(aVar.f28247i, 1);
        }
    }
}
