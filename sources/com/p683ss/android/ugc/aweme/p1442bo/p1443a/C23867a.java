package com.p683ss.android.ugc.aweme.p1442bo.p1443a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;

/* renamed from: com.ss.android.ugc.aweme.bo.a.a */
public final class C23867a extends C37859b {
    @C17952c(mo34828a = "type")

    /* renamed from: a */
    private int f63541a = -1;
    @C17952c(mo34828a = "aweme_info")

    /* renamed from: b */
    private Aweme f63542b;

    public final Aweme getAweme() {
        return this.f63542b;
    }

    public final int getFeedType() {
        if (this.f63541a != 8) {
            return this.f63541a;
        }
        return 65280;
    }

    public final void setFeedType(int i) {
        this.f63541a = i;
    }
}
