package com.p683ss.android.ugc.aweme.crossplatform.view;

import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.g */
public final class C27305g {

    /* renamed from: a */
    final List<C27304f> f72029a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.g$a */
    public enum C27306a {
        LOAD_START,
        LOAD_FINISH
    }

    /* renamed from: a */
    public final void mo55742a(C27304f fVar) {
        C52711k.m112240b(fVar, "observer");
        this.f72029a.add(fVar);
    }

    /* renamed from: a */
    public final void mo55743a(C27306a aVar) {
        C52711k.m112240b(aVar, "status");
        switch (C27307h.f72031a[aVar.ordinal()]) {
            case 1:
                for (C27304f q : this.f72029a) {
                    q.mo55393q();
                }
                return;
            case 2:
                for (C27304f w : this.f72029a) {
                    w.mo55411w();
                }
                break;
        }
    }
}
