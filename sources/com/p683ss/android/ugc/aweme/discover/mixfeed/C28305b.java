package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27370d;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28299a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b */
public class C28305b<T extends C28299a<?>> extends C27370d<T, Aweme> {
    /* renamed from: e */
    public final List<Aweme> mo55858e() {
        C26832a aVar = this.f70700f;
        C52711k.m112236a((Object) aVar, "mModel");
        return ((C28299a) aVar).getItems();
    }

    /* renamed from: f */
    public final List<Aweme> mo55859f() {
        C26832a aVar = this.f70700f;
        C52711k.m112236a((Object) aVar, "mModel");
        return ((C28299a) aVar).getItems();
    }

    /* renamed from: b */
    public final /* synthetic */ String mo55857b(Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme == null) {
            return "";
        }
        String m = C23198ae.m56877m(aweme);
        C52711k.m112236a((Object) m, "MobUtils.getAid(data ?: return \"\")");
        return m;
    }
}
