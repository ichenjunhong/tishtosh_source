package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class bsd {

    /* renamed from: a */
    public final boolean f43756a;

    /* renamed from: b */
    public final int f43757b;

    /* renamed from: c */
    public final int f43758c;

    /* renamed from: d */
    public final int f43759d;

    /* renamed from: e */
    public final boolean f43760e;

    /* renamed from: f */
    public final boolean f43761f;

    /* renamed from: g */
    public final int f43762g;

    /* renamed from: h */
    public final int f43763h;

    /* renamed from: i */
    public final boolean f43764i;

    public bsd() {
        this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    private bsd(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.f43756a = true;
        this.f43757b = Integer.MAX_VALUE;
        this.f43758c = Integer.MAX_VALUE;
        this.f43759d = Integer.MAX_VALUE;
        this.f43760e = true;
        this.f43761f = true;
        this.f43762g = Integer.MAX_VALUE;
        this.f43763h = Integer.MAX_VALUE;
        this.f43764i = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bsd bsd = (bsd) obj;
        return this.f43756a == bsd.f43756a && this.f43757b == bsd.f43757b && this.f43758c == bsd.f43758c && this.f43760e == bsd.f43760e && this.f43761f == bsd.f43761f && this.f43764i == bsd.f43764i && this.f43762g == bsd.f43762g && this.f43763h == bsd.f43763h && this.f43759d == bsd.f43759d && TextUtils.equals(null, null) && TextUtils.equals(null, null);
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.f43756a ? 1 : 0)) * 31) + this.f43757b) * 31) + this.f43758c) * 31) + this.f43759d) * 31) + (this.f43760e ? 1 : 0)) * 31) + (this.f43761f ? 1 : 0)) * 31) + (this.f43764i ? 1 : 0)) * 31) + this.f43762g) * 31) + this.f43763h;
    }
}
