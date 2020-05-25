package com.p683ss.android.ugc.aweme.shortvideo.duet;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.a */
public final class C43236a {

    /* renamed from: a */
    public static final C43236a f109338a = new C43236a();

    private C43236a() {
    }

    /* renamed from: a */
    public static final boolean m94873a(ShortVideoContext shortVideoContext) {
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        if (!shortVideoContext.mo86365f() || !C39618d.f101152P.mo83103a(C40790a.StudioDuetChangeLayout)) {
            return false;
        }
        return true;
    }
}
