package com.p683ss.android.ugc.aweme.following.p1770ui.viewholder;

import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.d */
final /* synthetic */ class C32288d extends C52720t {

    /* renamed from: a */
    public static final C52771j f84120a = new C32288d();

    C32288d() {
    }

    public final String getName() {
        return "unreadUidList";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ConnectedRelationState.class);
    }

    public final String getSignature() {
        return "getUnreadUidList()Ljava/util/List;";
    }

    public final Object get(Object obj) {
        return ((ConnectedRelationState) obj).getUnreadUidList();
    }
}
