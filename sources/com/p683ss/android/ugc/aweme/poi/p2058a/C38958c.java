package com.p683ss.android.ugc.aweme.poi.p2058a;

import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.a.c */
public final class C38958c extends C37859b implements Serializable {
    public String aid = "";
    public boolean isAweme;
    public String relatedId;
    public boolean showDividerLine;
    public int targetPosition;

    public final int getFeedType() {
        return 65444;
    }

    public final void setFeedType(int i) {
    }

    public C38958c(String str, boolean z, boolean z2) {
        this.relatedId = str;
        this.isAweme = z;
        this.showDividerLine = z2;
    }

    public C38958c(String str, boolean z, int i, boolean z2) {
        this.relatedId = str;
        this.isAweme = z;
        this.targetPosition = i;
        this.showDividerLine = z2;
    }
}
