package com.bytedance.android.livesdk.gift.dialog;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.b */
final /* synthetic */ class C7245b implements C0199s {

    /* renamed from: a */
    private final C7244a f19669a;

    C7245b(C7244a aVar) {
        this.f19669a = aVar;
    }

    public final void onChanged(Object obj) {
        C7244a aVar = this.f19669a;
        C7290b bVar = (C7290b) obj;
        if (bVar != null && bVar.f19851a == 0) {
            aVar.dismissAllowingStateLoss();
        }
    }
}
