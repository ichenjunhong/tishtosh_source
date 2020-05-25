package com.p683ss.android.ugc.aweme.following.p1770ui;

import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.d */
final /* synthetic */ class C32149d extends C52720t {

    /* renamed from: a */
    public static final C52771j f83875a = new C32149d();

    C32149d() {
    }

    public final String getName() {
        return "connectedRelationCount";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(FollowRelationState.class);
    }

    public final String getSignature() {
        return "getConnectedRelationCount()I";
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((FollowRelationState) obj).getConnectedRelationCount());
    }
}
