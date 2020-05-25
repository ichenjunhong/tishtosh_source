package com.facebook.share.internal;

import com.facebook.internal.C14312f;

/* renamed from: com.facebook.share.internal.m */
public enum C14618m implements C14312f {
    SHARE_STORY_ASSET(20170417);
    

    /* renamed from: a */
    private int f37917a;

    public final String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    public final int getMinVersion() {
        return this.f37917a;
    }

    private C14618m(int i) {
        this.f37917a = 20170417;
    }
}
