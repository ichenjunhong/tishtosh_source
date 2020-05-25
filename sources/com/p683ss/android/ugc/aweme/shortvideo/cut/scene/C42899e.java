package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e */
final /* synthetic */ class C42899e extends C52720t {

    /* renamed from: a */
    public static final C52771j f108404a = new C42899e();

    C42899e() {
    }

    public final String getName() {
        return "selectTime";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CutVideoBottomBarState.class);
    }

    public final String getSignature() {
        return "getSelectTime()Ljava/lang/Float;";
    }

    public final Object get(Object obj) {
        return ((CutVideoBottomBarState) obj).getSelectTime();
    }
}
