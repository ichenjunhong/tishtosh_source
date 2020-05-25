package com.p683ss.caijing.globaliap.p2559d;

import android.text.TextUtils;

/* renamed from: com.ss.caijing.globaliap.d.c */
public final class C51237c extends Exception {

    /* renamed from: a */
    private Exception f127961a;

    /* renamed from: b */
    private String f127962b;

    public C51237c() {
    }

    public final String toString() {
        if (this.f127961a != null) {
            return this.f127961a.toString();
        }
        if (!TextUtils.isEmpty(this.f127962b)) {
            return this.f127962b;
        }
        return super.toString();
    }

    public C51237c(Exception exc) {
        this.f127961a = exc;
    }

    public C51237c(String str) {
        this.f127962b = str;
    }
}
