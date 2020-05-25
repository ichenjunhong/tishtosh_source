package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class brv {

    /* renamed from: a */
    public final int f43722a = 1;

    /* renamed from: b */
    private final zzlg[] f43723b;

    /* renamed from: c */
    private int f43724c;

    public brv(zzlg... zzlgArr) {
        bti.m36701b(true);
        this.f43723b = zzlgArr;
    }

    /* renamed from: a */
    public final zzlg mo30624a(int i) {
        return this.f43723b[i];
    }

    /* renamed from: a */
    public final int mo30623a(zzlg zzlg) {
        for (int i = 0; i < this.f43723b.length; i++) {
            if (zzlg == this.f43723b[i]) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f43724c == 0) {
            this.f43724c = Arrays.hashCode(this.f43723b) + 527;
        }
        return this.f43724c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        brv brv = (brv) obj;
        return this.f43722a == brv.f43722a && Arrays.equals(this.f43723b, brv.f43723b);
    }
}
