package com.p683ss.android.ugc.aweme.follow.widet;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.follow.widet.c */
final /* synthetic */ class C31990c implements C23505g {

    /* renamed from: a */
    private final C319811 f83501a;

    /* renamed from: b */
    private final User f83502b;

    C31990c(C319811 r1, User user) {
        this.f83501a = r1;
        this.f83502b = user;
    }

    /* renamed from: a */
    public final void mo46280a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo46279a() {
        C319811 r0 = this.f83501a;
        User user = this.f83502b;
        if (C20854a.m53167g().isLogin()) {
            C31980a.this.mo65175b(user);
        }
    }
}
