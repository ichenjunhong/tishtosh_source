package com.p683ss.android.ugc.aweme.poi.p2058a;

import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.a.b */
public final class C38957b extends C37859b implements Serializable {

    /* renamed from: a */
    private List<C39092f> f99227a;

    /* renamed from: b */
    private String f99228b;

    public final List<C39092f> getBanners() {
        return this.f99227a;
    }

    public final int getFeedType() {
        return 65449;
    }

    public final String getPoiId() {
        return this.f99228b;
    }

    public final void setFeedType(int i) {
    }

    public final int size() {
        if (this.f99227a != null) {
            return this.f99227a.size();
        }
        return 0;
    }

    public final C38957b setPoiId(String str) {
        this.f99228b = str;
        return this;
    }

    public C38957b(List<C39092f> list) {
        this.f99227a = list;
    }
}
