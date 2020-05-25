package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n */
final /* synthetic */ class C42932n extends C52720t {

    /* renamed from: a */
    public static final C52771j f108455a = new C42932n();

    C42932n() {
    }

    public final String getName() {
        return "updatePlayBoundaryEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CutVideoEditState.class);
    }

    public final String getSignature() {
        return "getUpdatePlayBoundaryEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((CutVideoEditState) obj).getUpdatePlayBoundaryEvent();
    }
}
