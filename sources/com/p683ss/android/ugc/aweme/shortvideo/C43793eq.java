package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.tools.C47349x;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eq */
final /* synthetic */ class C43793eq implements C52671b {

    /* renamed from: a */
    private final C43791eo f110890a;

    /* renamed from: b */
    private final C47349x f110891b;

    C43793eq(C43791eo eoVar, C47349x xVar) {
        this.f110890a = eoVar;
        this.f110891b = xVar;
    }

    public final Object invoke(Object obj) {
        C43791eo eoVar = this.f110890a;
        Integer num = (Integer) obj;
        eoVar.f110885a.runOnUiThread(new C43794er(eoVar, num, this.f110891b));
        return C52860x.f131107a;
    }
}
