package com.bytedance.ies.dmt.p664ui.p666b;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.b.h */
final /* synthetic */ class C10650h implements OnClickListener {

    /* renamed from: a */
    private final C10641a f28302a;

    C10650h(C10641a aVar) {
        this.f28302a = aVar;
    }

    public final void onClick(View view) {
        C10641a aVar = this.f28302a;
        if (!aVar.f28245f) {
            C10641a.m21428a(false, aVar.f28219a);
            new Handler().postDelayed(new C10648f(aVar), 100);
        }
        if (aVar.f28242c != null) {
            aVar.f28242c.onClick(aVar.f28247i, 0);
        }
    }
}
