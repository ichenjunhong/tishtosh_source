package com.p683ss.android.ugc.aweme.sdk.iap.utils;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.c */
public final class C41389c {

    /* renamed from: a */
    public int f104939a;

    /* renamed from: b */
    public String f104940b;

    /* renamed from: a */
    public final boolean mo84000a() {
        if (this.f104939a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo84001b() {
        if (!mo84000a()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IabResult: ");
        sb.append(this.f104940b);
        return sb.toString();
    }

    public C41389c(int i, String str) {
        this.f104939a = i;
        if (str == null || str.trim().length() == 0) {
            this.f104940b = C41376b.m91187a(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (response: ");
        sb.append(C41376b.m91187a(i));
        sb.append(")");
        this.f104940b = sb.toString();
    }
}
