package com.p683ss.android.ugc.aweme.poi.p2058a;

import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.poi.model.C39103ai;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.a.e */
public final class C38960e extends C37859b implements Serializable {
    public String poiId;
    public C39103ai productInfo;

    public final int getFeedType() {
        return 65448;
    }

    public final void setFeedType(int i) {
    }

    public final String getSpSource() {
        if (this.productInfo == null) {
            return "";
        }
        return this.productInfo.supplierSource;
    }

    public C38960e(C39103ai aiVar, String str) {
        this.productInfo = aiVar;
        this.poiId = str;
    }
}
