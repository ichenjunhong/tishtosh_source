package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.C25944j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bb */
final /* synthetic */ class C26417bb implements C26416a {

    /* renamed from: a */
    private final Aweme f69672a;

    C26417bb(Aweme aweme) {
        this.f69672a = aweme;
    }

    /* renamed from: a */
    public final void mo54128a(boolean z) {
        Aweme aweme = this.f69672a;
        if (z) {
            C25944j.m62908a().getFeedRawAdLogService().mo53150n(C11010c.m22280a(), aweme);
        } else {
            C25944j.m62908a().getFeedRawAdLogService().mo53151o(C11010c.m22280a(), aweme);
        }
    }
}
