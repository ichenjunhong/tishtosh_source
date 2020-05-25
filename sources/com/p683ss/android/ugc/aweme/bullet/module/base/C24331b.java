package com.p683ss.android.ugc.aweme.bullet.module.base;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.bullet.business.C24252a;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.b */
public class C24331b extends C24316a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50098a(C24336d dVar) {
        C52711k.m112240b(dVar, "commonBizWebParams");
        OpenURLHintLayout openURLHintLayout = this.f64543g;
        if (openURLHintLayout != null) {
            openURLHintLayout.mo54442a(C23324d.m57378a().getRawAdAwemeById(dVar.mo50124e()));
        }
    }

    public C24331b(C10326b bVar, C24254b bVar2) {
        C52711k.m112240b(bVar, "providerFactory");
        C52711k.m112240b(bVar2, "bulletBusiness");
        super(bVar, bVar2);
    }

    public /* synthetic */ C24331b(C10326b bVar, C24254b bVar2, int i, C52707g gVar) {
        this(bVar, new C24252a());
    }
}
