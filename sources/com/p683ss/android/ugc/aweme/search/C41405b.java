package com.p683ss.android.ugc.aweme.search;

import android.view.ViewStub;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.discover.alading.C28037g;
import com.p683ss.android.ugc.aweme.discover.alading.C28038h;
import com.p683ss.android.ugc.aweme.discover.alading.C28044k;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.p1487c.C24479b;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.search.b */
public final class C41405b {
    /* renamed from: a */
    public static C28038h m91221a(C28037g gVar, SearchChallenge searchChallenge) {
        return new C28038h(gVar);
    }

    /* renamed from: a */
    public static C24479b m91220a(ViewStub viewStub, SearchUser searchUser) {
        if (viewStub == null || searchUser == null || C9376b.m18558a((Collection<T>) searchUser.musicCards)) {
            return null;
        }
        return new C28044k(viewStub);
    }
}
