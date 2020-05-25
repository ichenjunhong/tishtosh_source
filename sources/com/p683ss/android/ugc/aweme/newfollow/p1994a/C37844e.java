package com.p683ss.android.ugc.aweme.newfollow.p1994a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;

/* renamed from: com.ss.android.ugc.aweme.newfollow.a.e */
public class C37844e extends C31805p {
    /* renamed from: k */
    public void mo64793k() {
        this.f83009Q.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo64754a(long j) {
        if (this.f83048c == null || this.f83048c.getAuthor() == null || !TextUtils.equals(this.f83048c.getAuthor().getUid(), C20902b.m53242a().getCurUserId())) {
            super.mo64754a(j);
        }
    }

    public C37844e(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar) {
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
