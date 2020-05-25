package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bx */
public final class C42479bx {

    /* renamed from: a */
    public static final C42479bx f107419a = new C42479bx();

    private C42479bx() {
    }

    /* renamed from: a */
    public static final long m93330a(C42482c cVar, String str) {
        C52711k.m112240b(cVar, "music");
        long b = (long) C39618d.f101168i.mo80578b(str);
        if (cVar.getPresenterDuration() > 0) {
            long presenterDuration = (long) cVar.getPresenterDuration();
            if (Math.abs(b - presenterDuration) >= 1000) {
                return presenterDuration;
            }
        }
        return b;
    }
}
