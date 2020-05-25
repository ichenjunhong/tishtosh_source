package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.model.HotSoonRelationNotice */
public final class HotSoonRelationNotice extends IMUser {
    private final String notice;

    public final String getNotice() {
        return this.notice;
    }

    public HotSoonRelationNotice(String str) {
        C52711k.m112240b(str, "notice");
        this.notice = str;
    }
}
