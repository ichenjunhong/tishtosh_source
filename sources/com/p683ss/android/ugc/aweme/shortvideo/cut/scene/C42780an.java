package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an */
final /* synthetic */ class C42780an extends C52720t {

    /* renamed from: a */
    public static final C52771j f108179a = new C42780an();

    C42780an() {
    }

    public final String getName() {
        return "resetSurfaceSizeEvent";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CutVideoPreviewState.class);
    }

    public final String getSignature() {
        return "getResetSurfaceSizeEvent()Lcom/ss/android/ugc/gamora/jedi/JediPairEvent;";
    }

    public final Object get(Object obj) {
        return ((CutVideoPreviewState) obj).getResetSurfaceSizeEvent();
    }
}
