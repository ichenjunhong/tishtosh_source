package com.p683ss.android.ugc.aweme;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.detail.api.DetailApi;
import com.p683ss.android.ugc.aweme.familiar.experiment.C29644a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1632di.C27608av;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ab */
public final class C20848ab implements C20845aa {
    /* renamed from: c */
    public static C20845aa m53153c() {
        if (C27991b.f73507c == null) {
            synchronized (C20845aa.class) {
                if (C27991b.f73507c == null) {
                    C27991b.f73507c = C27608av.m66285a();
                }
            }
        }
        return (C20845aa) C27991b.f73507c;
    }

    /* renamed from: a */
    public final boolean mo44458a() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo44459b() {
        return C29644a.m69692a();
    }

    /* renamed from: a */
    public final Aweme mo44457a(String str, String str2) {
        Aweme a = DetailApi.m65845a(str, str2);
        C52711k.m112236a((Object) a, "DetailApi.queryAweme(aid, originType)");
        return a;
    }
}
