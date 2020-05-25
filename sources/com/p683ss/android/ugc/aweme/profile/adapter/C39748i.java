package com.p683ss.android.ugc.aweme.profile.adapter;

import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.i */
final /* synthetic */ class C39748i implements C0011g {

    /* renamed from: a */
    private final C39744e f101478a;

    C39748i(C39744e eVar) {
        this.f101478a = eVar;
    }

    public final Object then(C0013i iVar) {
        C39744e eVar = this.f101478a;
        if (iVar.mo26b()) {
            Integer num = (Integer) iVar.mo34e();
            eVar.f101471c.setText(eVar.f101471c.getContext().getResources().getQuantityString(R.plurals.f, num.intValue(), new Object[]{num}));
        }
        return null;
    }
}
