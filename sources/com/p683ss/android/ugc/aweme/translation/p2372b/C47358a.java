package com.p683ss.android.ugc.aweme.translation.p2372b;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47354b;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47356c;
import com.p683ss.android.ugc.aweme.translation.p2373ui.C47364a;

/* renamed from: com.ss.android.ugc.aweme.translation.b.a */
public final class C47358a extends C37717b<C47354b, C47364a> implements C26874f {
    /* renamed from: b */
    public final void mo44838b() {
        C47356c cVar = (C47356c) ((C47354b) this.f96123b).mData;
        if (cVar == null) {
            ((C47364a) this.f96124c).mo63628a(new Exception());
        } else {
            ((C47364a) this.f96124c).mo63623a(cVar);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        ((C47364a) this.f96124c).mo63628a(exc);
    }

    public C47358a(C47354b bVar, C47364a aVar) {
        super(bVar, aVar);
        ((C47354b) this.f96123b).addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo94640a(String str, String str2, String str3, String str4, int i) {
        ((C47354b) this.f96123b).mo94636a(str, str2, str3, str4, i);
    }
}
