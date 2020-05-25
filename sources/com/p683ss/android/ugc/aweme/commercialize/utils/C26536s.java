package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.s */
final /* synthetic */ class C26536s implements C26534a {

    /* renamed from: a */
    private final Context f69870a;

    /* renamed from: b */
    private final Aweme f69871b;

    C26536s(Context context, Aweme aweme) {
        this.f69870a = context;
        this.f69871b = aweme;
    }

    /* renamed from: a */
    public final void mo49915a(boolean z) {
        Context context = this.f69870a;
        Aweme aweme = this.f69871b;
        if (z) {
            C26088l.m63346e(context, aweme);
        } else {
            C26088l.m63352f(context, aweme);
        }
    }
}
