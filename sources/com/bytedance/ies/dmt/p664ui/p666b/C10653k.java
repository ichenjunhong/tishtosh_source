package com.bytedance.ies.dmt.p664ui.p666b;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.b.k */
final /* synthetic */ class C10653k implements OnClickListener {

    /* renamed from: a */
    private final C10641a f28305a;

    C10653k(C10641a aVar) {
        this.f28305a = aVar;
    }

    public final void onClick(View view) {
        C10641a aVar = this.f28305a;
        C10641a.m21428a(false, aVar.f28219a);
        new Handler().postDelayed(new C10656n(aVar), 100);
    }
}
