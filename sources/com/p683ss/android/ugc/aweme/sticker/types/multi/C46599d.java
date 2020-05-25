package com.p683ss.android.ugc.aweme.sticker.types.multi;

import android.arch.lifecycle.C0199s;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46351i;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.d */
final /* synthetic */ class C46599d implements C0199s {

    /* renamed from: a */
    private final C46598c f117574a;

    C46599d(C46598c cVar) {
        this.f117574a = cVar;
    }

    public final void onChanged(Object obj) {
        C46598c cVar = this.f117574a;
        C46351i iVar = (C46351i) obj;
        if (iVar != null) {
            int i = iVar.f116945a.f116796b;
            int i2 = iVar.f116946b.f116796b;
            if (i >= 0 && i2 != i) {
                cVar.f117568a.f117558b = i2;
                cVar.f117568a.notifyItemChanged(i, C9414h.m18630a(cVar.f117569b) ? null : cVar.f117569b.get(i));
            }
        }
    }
}
