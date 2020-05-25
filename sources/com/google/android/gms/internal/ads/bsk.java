package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bsk {

    /* renamed from: a */
    public final int f43775a;

    /* renamed from: b */
    private final bsi[] f43776b;

    /* renamed from: c */
    private int f43777c;

    public bsk(bsi... bsiArr) {
        this.f43776b = bsiArr;
        this.f43775a = bsiArr.length;
    }

    /* renamed from: a */
    public final bsi mo30659a(int i) {
        return this.f43776b[i];
    }

    /* renamed from: a */
    public final bsi[] mo30660a() {
        return (bsi[]) this.f43776b.clone();
    }

    public final int hashCode() {
        if (this.f43777c == 0) {
            this.f43777c = Arrays.hashCode(this.f43776b) + 527;
        }
        return this.f43777c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f43776b, ((bsk) obj).f43776b);
    }
}
