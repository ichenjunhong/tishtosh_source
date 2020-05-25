package com.p683ss.android.ugc.aweme.detail.p1627i;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.presenter.C31877a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.i.e */
public final class C27371e extends C27370d<C31877a, FollowFeed> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<FollowFeed> mo55858e() {
        if (this.f70700f == null) {
            return null;
        }
        return ((C31877a) this.f70700f).getItems();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo55859f() {
        return C31877a.m74301a(((C31877a) this.f70700f).getItems());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ String mo55857b(Object obj) {
        FollowFeed followFeed = (FollowFeed) obj;
        if (followFeed == null) {
            return "";
        }
        return C23198ae.m56877m(followFeed.getAweme());
    }
}
