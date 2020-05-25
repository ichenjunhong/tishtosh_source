package com.p683ss.android.ugc.aweme.following.p1770ui;

import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.m */
final /* synthetic */ class C32198m extends C52720t {

    /* renamed from: a */
    public static final C52771j f83945a = new C32198m();

    C32198m() {
    }

    public final String getName() {
        return "listState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(FollowerRelationState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((FollowerRelationState) obj).getListState();
    }
}
