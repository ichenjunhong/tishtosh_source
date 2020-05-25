package com.p683ss.android.ugc.aweme.poi.p2059b;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.b.d */
public final class C39044d implements Serializable {
    public int orderResult;
    public String pageType;

    public final boolean isSuccess() {
        if (this.orderResult == 1) {
            return true;
        }
        return false;
    }

    public final boolean isBookOrder() {
        return "book".equalsIgnoreCase(this.pageType);
    }

    public C39044d(String str, int i) {
        this.pageType = str;
        this.orderResult = i;
    }
}
