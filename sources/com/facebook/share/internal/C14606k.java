package com.facebook.share.internal;

import com.facebook.internal.C14312f;

/* renamed from: com.facebook.share.internal.k */
public enum C14606k implements C14312f {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    

    /* renamed from: a */
    private int f37905a;

    public final String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    public final int getMinVersion() {
        return this.f37905a;
    }

    private C14606k(int i) {
        this.f37905a = i;
    }
}
