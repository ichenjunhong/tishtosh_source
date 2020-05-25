package com.p683ss.android.ugc.aweme.profile.widgets;

import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.c */
final /* synthetic */ class C40720c extends C52720t {

    /* renamed from: a */
    public static final C52771j f103753a = new C40720c();

    C40720c() {
    }

    public final String getName() {
        return "from";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ProfileState.class);
    }

    public final String getSignature() {
        return "getFrom()Ljava/lang/String;";
    }

    public final Object get(Object obj) {
        return ((ProfileState) obj).getFrom();
    }
}
