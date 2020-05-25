package com.p683ss.android.ugc.aweme.following.p1770ui.viewholder;

import com.p683ss.android.ugc.aweme.user.repository.UserState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.b */
final /* synthetic */ class C32286b extends C52720t {

    /* renamed from: a */
    public static final C52771j f84118a = new C32286b();

    C32286b() {
    }

    public final String getName() {
        return "followStatus";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(UserState.class);
    }

    public final String getSignature() {
        return "getFollowStatus()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((UserState) obj).getFollowStatus();
    }
}
