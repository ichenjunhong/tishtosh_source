package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0199s;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bf */
final /* synthetic */ class C28546bf implements C0199s {

    /* renamed from: a */
    private final C28541bb f75017a;

    C28546bf(C28541bb bbVar) {
        this.f75017a = bbVar;
    }

    public final void onChanged(Object obj) {
        C28541bb bbVar = this.f75017a;
        Integer num = (Integer) obj;
        if (num != null && num.intValue() != bbVar.mo58217a()) {
            bbVar.f75002b.setCurrentItem(num.intValue(), false);
        }
    }
}
