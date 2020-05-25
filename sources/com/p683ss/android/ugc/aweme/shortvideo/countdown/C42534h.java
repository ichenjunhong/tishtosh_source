package com.p683ss.android.ugc.aweme.shortvideo.countdown;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.h */
final /* synthetic */ class C42534h extends C52720t {

    /* renamed from: a */
    public static final C52771j f107569a = new C42534h();

    C42534h() {
    }

    public final String getName() {
        return "maxDuration";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CountdownState.class);
    }

    public final String getSignature() {
        return "getMaxDuration()J";
    }

    public final Object get(Object obj) {
        return Long.valueOf(((CountdownState) obj).getMaxDuration());
    }
}
