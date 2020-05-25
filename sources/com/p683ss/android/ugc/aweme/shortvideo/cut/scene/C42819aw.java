package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw */
final /* synthetic */ class C42819aw extends C52720t {

    /* renamed from: a */
    public static final C52771j f108255a = new C42819aw();

    C42819aw() {
    }

    public final String getName() {
        return "visible";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CutVideoSpeedState.class);
    }

    public final String getSignature() {
        return "getVisible()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((CutVideoSpeedState) obj).getVisible();
    }
}
