package com.p683ss.android.ugc.aweme.poi.p2074ui.upload;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.poi.model.C39115au;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.d */
public final class C39426d extends C26851b<C39424b, C39432g> {
    /* renamed from: b */
    public final void mo44838b() {
        if (this.f70701g != null && this.f70700f != null) {
            C39432g gVar = (C39432g) this.f70701g;
            C26832a aVar = this.f70700f;
            C52711k.m112236a((Object) aVar, "mModel");
            C39115au auVar = (C39115au) ((C39424b) aVar).getData();
            C52711k.m112236a((Object) auVar, "mModel.data");
            gVar.mo80388a(auVar);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null && this.f70700f != null) {
            ((C39432g) this.f70701g).mo80389a(exc);
        }
    }
}
