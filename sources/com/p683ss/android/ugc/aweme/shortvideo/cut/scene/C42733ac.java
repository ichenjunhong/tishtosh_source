package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ac */
final /* synthetic */ class C42733ac extends C52720t {

    /* renamed from: a */
    public static final C52771j f108057a = new C42733ac();

    C42733ac() {
    }

    public final String getName() {
        return "deleteSegEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CutVideoListState.class);
    }

    public final String getSignature() {
        return "getDeleteSegEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((CutVideoListState) obj).getDeleteSegEvent();
    }
}
