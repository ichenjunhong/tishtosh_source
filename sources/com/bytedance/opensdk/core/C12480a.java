package com.bytedance.opensdk.core;

import com.bytedance.opensdk.core.base.C12497a;

/* renamed from: com.bytedance.opensdk.core.a */
public enum C12480a {
    GRANT(0, 100),
    BIND(1, 100);
    

    /* renamed from: b */
    private final int f32795b;

    /* renamed from: c */
    private final int f32796c;

    public final int getApiSupportVersion() {
        return this.f32796c;
    }

    public final int getRequestCodeInt() {
        return C12497a.f32820a + this.f32795b;
    }

    private C12480a(int i, int i2) {
        this.f32795b = i;
        this.f32796c = 100;
    }
}
