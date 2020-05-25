package com.facebook.share.internal;

import com.facebook.internal.C14312f;

/* renamed from: com.facebook.share.internal.a */
public enum C14586a implements C14312f {
    SHARE_CAMERA_EFFECT(20170417);
    

    /* renamed from: a */
    private int f37891a;

    public final String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    public final int getMinVersion() {
        return this.f37891a;
    }

    private C14586a(int i) {
        this.f37891a = 20170417;
    }
}
