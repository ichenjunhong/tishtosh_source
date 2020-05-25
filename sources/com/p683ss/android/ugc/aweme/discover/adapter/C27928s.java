package com.p683ss.android.ugc.aweme.discover.adapter;

import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchAdData;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.s */
final /* synthetic */ class C27928s implements C52682m {

    /* renamed from: a */
    private final HotSearchAdData f73348a;

    C27928s(HotSearchAdData hotSearchAdData) {
        this.f73348a = hotSearchAdData;
    }

    public final Object invoke(Object obj, Object obj2) {
        HotSearchAdData hotSearchAdData = this.f73348a;
        Boolean bool = (Boolean) obj2;
        return ((C26080b) obj).mo53574a(hotSearchAdData.getCreativeId(), hotSearchAdData.getLogExtra());
    }
}
