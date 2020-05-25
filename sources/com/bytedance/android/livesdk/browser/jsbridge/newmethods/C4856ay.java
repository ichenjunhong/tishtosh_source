package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.p188b.C2964a;
import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ay */
final /* synthetic */ class C4856ay implements C4641g {

    /* renamed from: a */
    private final C10783f f13081a;

    /* renamed from: b */
    private final C8612a f13082b;

    /* renamed from: c */
    private final C4855a f13083c;

    C4856ay(C10783f fVar, C8612a aVar, C4855a aVar2) {
        this.f13081a = fVar;
        this.f13082b = aVar;
        this.f13083c = aVar2;
    }

    /* renamed from: a */
    public final void mo9061a(Object obj) {
        C10783f fVar = this.f13081a;
        C8612a aVar = this.f13082b;
        C4855a aVar2 = this.f13083c;
        C2964a aVar3 = (C2964a) obj;
        if (aVar3 != null && aVar3.hasDouPlusEntry) {
            String.valueOf(aVar2.f13079a);
        } else if (C4857az.m11386a(fVar.f28972a)) {
            C4575an.m10981a((int) R.string.hpw);
        } else {
            C4575an.m10981a((int) R.string.f2k);
        }
    }
}
