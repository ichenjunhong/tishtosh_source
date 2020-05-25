package com.p683ss.android.ugc.aweme.profile.widgets;

import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.g */
final /* synthetic */ class C40724g extends C52720t {

    /* renamed from: a */
    public static final C52771j f103757a = new C40724g();

    C40724g() {
    }

    public final String getName() {
        return "curTabType";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ProfileState.class);
    }

    public final String getSignature() {
        return "getCurTabType()I";
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((ProfileState) obj).getCurTabType());
    }
}
