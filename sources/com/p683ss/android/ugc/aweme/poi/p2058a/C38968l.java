package com.p683ss.android.ugc.aweme.poi.p2058a;

import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.a.l */
public final class C38968l extends C37859b {

    /* renamed from: a */
    public List<? extends AwemeRawAd> f99253a;

    /* renamed from: b */
    public String f99254b;

    /* renamed from: c */
    public boolean f99255c;

    public final int getFeedType() {
        return 65452;
    }

    public final void setFeedType(int i) {
    }

    /* renamed from: a */
    public final Integer mo79125a() {
        List<? extends AwemeRawAd> list = this.f99253a;
        if (list != null) {
            return Integer.valueOf(list.size());
        }
        return null;
    }

    /* renamed from: b */
    public final AwemeRawAd mo79126b() {
        List<? extends AwemeRawAd> list = this.f99253a;
        if (list != null) {
            return (AwemeRawAd) list.get(0);
        }
        return null;
    }

    public C38968l(List<? extends AwemeRawAd> list, String str, boolean z) {
        C52711k.m112240b(str, "title");
        this.f99253a = list;
        this.f99254b = str;
        this.f99255c = z;
    }
}
