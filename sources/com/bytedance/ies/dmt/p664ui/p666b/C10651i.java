package com.bytedance.ies.dmt.p664ui.p666b;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.b.i */
final /* synthetic */ class C10651i implements OnClickListener {

    /* renamed from: a */
    private final C10641a f28303a;

    C10651i(C10641a aVar) {
        this.f28303a = aVar;
    }

    public final void onClick(View view) {
        C10641a aVar = this.f28303a;
        if (!aVar.f28244e) {
            C10641a.m21428a(false, aVar.f28219a);
            new Handler().postDelayed(new C10647e(aVar), 100);
        }
        if (aVar.f28241b != null) {
            aVar.f28241b.onClick(aVar.f28247i, 1);
        }
    }
}
