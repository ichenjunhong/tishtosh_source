package com.p683ss.android.ugc.aweme.profile.util;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.profile.presenter.C39958b;
import p2628d.C52857u;

/* renamed from: com.ss.android.ugc.aweme.profile.util.n */
public final class C40555n {

    /* renamed from: a */
    public static final C40555n f103479a = new C40555n();

    private C40555n() {
    }

    /* renamed from: a */
    public final boolean mo82824a(C26876b<?> bVar, int i) {
        C26875a aVar;
        if (bVar != null) {
            aVar = (C26875a) bVar.mo54803n();
        } else {
            aVar = null;
        }
        if (!(aVar instanceof C39958b) || ((C26875a) bVar.mo54803n()) != null) {
            return false;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.presenter.AwemeModel");
    }
}
