package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.e */
final /* synthetic */ class C44734e extends C52720t {

    /* renamed from: a */
    public static final C52771j f113245a = new C44734e();

    C44734e() {
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
