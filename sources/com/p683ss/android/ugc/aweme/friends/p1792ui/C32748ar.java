package com.p683ss.android.ugc.aweme.friends.p1792ui;

import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ar */
public final class C32748ar extends C32774u implements C32763j {

    /* renamed from: a */
    private final C32741aq f85309a;

    /* renamed from: a */
    public final User mo66319a() {
        return this.f85309a.getData();
    }

    public C32748ar(C32741aq aqVar) {
        C52711k.m112240b(aqVar, "itemView");
        super(aqVar);
        this.f85309a = aqVar;
    }

    /* renamed from: a */
    public final void mo66320a(User user, int i, boolean z, int i2) {
        C52711k.m112240b(user, "user");
        this.f85309a.setData(user);
        this.f85309a.setPositionInApiList(i);
    }
}
