package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.k */
final /* synthetic */ class C44763k extends C52720t {

    /* renamed from: a */
    public static final C52771j f113301a = new C44763k();

    C44763k() {
    }

    public final String getName() {
        return "nextEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CutVideoState.class);
    }

    public final String getSignature() {
        return "getNextEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((CutVideoState) obj).getNextEvent();
    }
}
