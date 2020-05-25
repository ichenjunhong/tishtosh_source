package com.bytedance.android.live.base.model.p189c;

import java.io.IOException;

/* renamed from: com.bytedance.android.live.base.model.c.a */
public final class C2969a extends IOException {

    /* renamed from: a */
    private String f8699a;
    public int statusCode;

    public final String getMessage() {
        return this.f8699a;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C2969a(int i, String str) {
        this.statusCode = i;
        this.f8699a = str;
    }

    public C2969a(int i, String str, String str2, Throwable th) {
        super(str2, th);
        this.statusCode = i;
        this.f8699a = str;
    }
}
