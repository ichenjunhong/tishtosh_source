package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37975f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.j */
public final class C37892j extends C37975f {

    /* renamed from: ay */
    public boolean f96463ay;

    /* renamed from: V */
    public final int mo64837V() {
        return 5;
    }

    /* renamed from: W */
    public final String mo64838W() {
        return "from_user_state_tab";
    }

    /* renamed from: c */
    public final String mo64771c() {
        if (this.f96463ay) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: j */
    public final void mo64791j() {
        ImageView imageView = this.f83010R;
        C52711k.m112236a((Object) imageView, "mIvExtraBtn");
        imageView.setVisibility(8);
    }

    /* renamed from: T */
    public final String mo64835T() {
        Aweme aweme = this.f83048c;
        C52711k.m112236a((Object) aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        C52711k.m112236a((Object) authorUid, "mAweme.authorUid");
        return authorUid;
    }

    /* renamed from: U */
    public final String mo64836U() {
        Aweme aweme = this.f83048c;
        C52711k.m112236a((Object) aweme, "mAweme");
        String secAuthorUid = aweme.getSecAuthorUid();
        C52711k.m112236a((Object) secAuthorUid, "mAweme.secAuthorUid");
        return secAuthorUid;
    }

    public C37892j(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f96463ay = z;
    }
}
