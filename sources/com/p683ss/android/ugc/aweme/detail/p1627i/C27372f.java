package com.p683ss.android.ugc.aweme.detail.p1627i;

import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28335n;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.i.f */
public final class C27372f extends C27370d<C28335n, C28333l> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<C28333l> mo55858e() {
        C28335n nVar = (C28335n) this.f70700f;
        if (nVar != null) {
            return nVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo55859f() {
        List list;
        C28335n nVar = (C28335n) this.f70700f;
        if (nVar != null) {
            list = nVar.getItems();
        } else {
            list = null;
        }
        List<Aweme> a = C28335n.m67260a(list);
        C52711k.m112236a((Object) a, "SearchMixFeedModel.getAwemes(mModel?.items)");
        return a;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo55857b(Object obj) {
        C28333l lVar = (C28333l) obj;
        if (lVar != null) {
            Aweme aweme = lVar.getAweme();
            if (aweme != null) {
                String m = C23198ae.m56877m(aweme);
                C52711k.m112236a((Object) m, "MobUtils.getAid(data?.aweme ?: return \"\")");
                return m;
            }
        }
        return "";
    }
}
