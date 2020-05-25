package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37978i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.l */
public final class C37894l extends C37978i {

    /* renamed from: X */
    public boolean f96465X;

    /* renamed from: K */
    public final int mo65690K() {
        return 5;
    }

    /* renamed from: L */
    public final String mo65691L() {
        return "from_user_state_tab";
    }

    /* renamed from: r */
    public final String mo65673r() {
        if (this.f96465X) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: t */
    public final void mo65677t() {
        ImageView imageView = this.f84358B;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: I */
    public final String mo65688I() {
        Aweme aweme = this.f84362F;
        C52711k.m112236a((Object) aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        C52711k.m112236a((Object) authorUid, "mAweme.authorUid");
        return authorUid;
    }

    /* renamed from: J */
    public final String mo65689J() {
        Aweme aweme = this.f84362F;
        C52711k.m112236a((Object) aweme, "mAweme");
        String secAuthorUid = aweme.getSecAuthorUid();
        C52711k.m112236a((Object) secAuthorUid, "mAweme.secAuthorUid");
        return secAuthorUid;
    }

    public C37894l(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31758e eVar, C31754a aVar, boolean z) {
        C52711k.m112240b(eVar, "itemViewInteractListener");
        super(followFeedLayout, bVar, jVar, eVar, aVar);
        this.f96465X = z;
    }
}
