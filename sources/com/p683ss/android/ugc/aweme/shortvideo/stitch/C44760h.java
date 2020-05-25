package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.h */
final /* synthetic */ class C44760h extends C52720t {

    /* renamed from: a */
    public static final C52771j f113298a = new C44760h();

    C44760h() {
    }

    public final String getName() {
        return "quitEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CutVideoState.class);
    }

    public final String getSignature() {
        return "getQuitEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((CutVideoState) obj).getQuitEvent();
    }
}
