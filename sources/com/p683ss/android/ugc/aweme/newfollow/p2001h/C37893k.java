package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37976g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.k */
public final class C37893k extends C37976g {

    /* renamed from: aT */
    public boolean f96464aT;

    /* renamed from: ab */
    public final int mo64845ab() {
        return 5;
    }

    /* renamed from: ad */
    public final String mo64846ad() {
        return "from_user_state_tab";
    }

    /* renamed from: Z */
    public final String mo64842Z() {
        Aweme aweme = this.f83048c;
        if (aweme != null) {
            String authorUid = aweme.getAuthorUid();
            if (authorUid != null) {
                return authorUid;
            }
        }
        return "";
    }

    /* renamed from: aa */
    public final String mo64844aa() {
        Aweme aweme = this.f83048c;
        if (aweme != null) {
            String secAuthorUid = aweme.getSecAuthorUid();
            if (secAuthorUid != null) {
                return secAuthorUid;
            }
        }
        return "";
    }

    /* renamed from: c */
    public final String mo64771c() {
        if (this.f96464aT) {
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

    public C37893k(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f96464aT = z;
    }
}
