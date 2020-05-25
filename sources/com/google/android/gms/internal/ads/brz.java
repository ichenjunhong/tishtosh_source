package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class brz implements bsi {

    /* renamed from: a */
    private final brv f43745a;

    /* renamed from: b */
    private final int f43746b = 1;

    /* renamed from: c */
    private final int[] f43747c;

    /* renamed from: d */
    private final zzlg[] f43748d = new zzlg[this.f43746b];

    /* renamed from: e */
    private final long[] f43749e;

    /* renamed from: f */
    private int f43750f;

    public brz(brv brv, int... iArr) {
        bti.m36701b(true);
        this.f43745a = (brv) bti.m36697a(brv);
        for (int i = 0; i <= 0; i++) {
            this.f43748d[0] = brv.mo30624a(iArr[0]);
        }
        Arrays.sort(this.f43748d, new bsb());
        this.f43747c = new int[this.f43746b];
        for (int i2 = 0; i2 < this.f43746b; i2++) {
            this.f43747c[i2] = brv.mo30623a(this.f43748d[i2]);
        }
        this.f43749e = new long[this.f43746b];
    }

    /* renamed from: a */
    public final brv mo30643a() {
        return this.f43745a;
    }

    /* renamed from: b */
    public final int mo30645b() {
        return this.f43747c.length;
    }

    /* renamed from: a */
    public final zzlg mo30644a(int i) {
        return this.f43748d[i];
    }

    /* renamed from: b */
    public final int mo30646b(int i) {
        return this.f43747c[0];
    }

    public int hashCode() {
        if (this.f43750f == 0) {
            this.f43750f = (System.identityHashCode(this.f43745a) * 31) + Arrays.hashCode(this.f43747c);
        }
        return this.f43750f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        brz brz = (brz) obj;
        return this.f43745a == brz.f43745a && Arrays.equals(this.f43747c, brz.f43747c);
    }
}
