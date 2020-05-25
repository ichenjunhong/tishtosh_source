package com.p683ss.android.ugc.aweme.story.live;

import android.content.Context;
import com.p683ss.android.ugc.aweme.live.C36006a;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.story.live.l */
public final class C46653l {

    /* renamed from: a */
    Context f117667a;

    public C46653l(Context context) {
        this.f117667a = context;
    }

    /* renamed from: a */
    public final void mo93536a(User user) {
        C46645h.m101231b().mo70097a(new C36006a(this.f117667a, user).mo74741d(user.getRequestId()).mo74739b("message").mo74740c("live_cell"));
    }
}
