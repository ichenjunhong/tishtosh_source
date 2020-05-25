package com.p683ss.caijing.globaliap.p2561e;

import android.text.TextUtils;

/* renamed from: com.ss.caijing.globaliap.e.b */
public final class C51275b extends Exception {

    /* renamed from: a */
    int f128041a;

    /* renamed from: b */
    private String f128042b;

    /* renamed from: c */
    private Exception f128043c;

    public C51275b() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f128042b)) {
            sb.append(this.f128042b);
            sb.append("\r\n");
        }
        if (this.f128043c != null) {
            sb.append(this.f128043c.toString());
        }
        return sb.toString();
    }

    public C51275b(String str) {
        this.f128042b = str;
    }
}
