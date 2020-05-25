package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.tools.C47026e;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a.C49608a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r */
public final class C44405r {

    /* renamed from: a */
    private final C43225dr f112343a;

    public C44405r(C43225dr drVar) {
        C52711k.m112240b(drVar, "mOwner");
        this.f112343a = drVar;
    }

    public final void onEvent(C47026e eVar) {
        C52711k.m112240b(eVar, "event");
        if (this.f112343a.f33840g_ != null) {
            C49607a b = C49608a.m107073b(this.f112343a.mo87882I());
            if (b != null) {
                b.mo97515a(C43214dh.m94817a().mo50201b());
            }
            if (b != null) {
                b.mo97519a(false);
            }
        }
    }
}
