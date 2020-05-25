package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class brx {

    /* renamed from: a */
    public static final brx f43740a = new brx(new brv[0]);

    /* renamed from: b */
    public final int f43741b;

    /* renamed from: c */
    private final brv[] f43742c;

    /* renamed from: d */
    private int f43743d;

    public brx(brv... brvArr) {
        this.f43742c = brvArr;
        this.f43741b = brvArr.length;
    }

    /* renamed from: a */
    public final brv mo30640a(int i) {
        return this.f43742c[i];
    }

    /* renamed from: a */
    public final int mo30639a(brv brv) {
        for (int i = 0; i < this.f43741b; i++) {
            if (this.f43742c[i] == brv) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f43743d == 0) {
            this.f43743d = Arrays.hashCode(this.f43742c);
        }
        return this.f43743d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        brx brx = (brx) obj;
        return this.f43741b == brx.f43741b && Arrays.equals(this.f43742c, brx.f43742c);
    }
}
