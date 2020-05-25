package com.p683ss.android.ugc.aweme.following.p1770ui.viewholder;

import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.c */
final /* synthetic */ class C32287c extends C52720t {

    /* renamed from: a */
    public static final C52771j f84119a = new C32287c();

    C32287c() {
    }

    public final String getName() {
        return "unreadCountMap";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ConnectedRelationState.class);
    }

    public final String getSignature() {
        return "getUnreadCountMap()Ljava/util/HashMap;";
    }

    public final Object get(Object obj) {
        return ((ConnectedRelationState) obj).getUnreadCountMap();
    }
}
