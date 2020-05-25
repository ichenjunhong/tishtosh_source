package com.p683ss.android.ugc.aweme.profile.service;

import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.service.h */
public final class C40015h implements C40020m {
    /* renamed from: a */
    public final boolean mo82040a() {
        return C29692a.f77601b;
    }

    /* renamed from: a */
    public final void mo82039a(boolean z) {
        C29692a.f77601b = z;
    }

    /* renamed from: a */
    public final void mo82038a(Aweme aweme) {
        C52711k.m112240b(aweme, "data");
        C26890h.m65011a(C29692a.m69740b(1), C29692a.m69739b("video", "collection_video").mo47829a("author_id", C23198ae.m56846a(aweme)).mo47829a("group_id", C23198ae.m56877m(aweme)).mo47829a("music_id", C23198ae.m56873k(aweme)).mo47829a("poi_id", C23198ae.m56861e(aweme)).f61491a);
    }
}
