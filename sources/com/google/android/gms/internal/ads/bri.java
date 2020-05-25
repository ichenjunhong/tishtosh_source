package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

final class bri implements bre, brf {

    /* renamed from: a */
    public final bre[] f43660a;

    /* renamed from: b */
    private final IdentityHashMap<brr, Integer> f43661b = new IdentityHashMap<>();

    /* renamed from: c */
    private brf f43662c;

    /* renamed from: d */
    private int f43663d;

    /* renamed from: e */
    private brx f43664e;

    /* renamed from: f */
    private bre[] f43665f;

    /* renamed from: g */
    private brs f43666g;

    public bri(bre... breArr) {
        this.f43660a = breArr;
    }

    /* renamed from: a */
    public final void mo30577a(brf brf, long j) {
        this.f43662c = brf;
        this.f43663d = this.f43660a.length;
        for (bre a : this.f43660a) {
            a.mo30577a(this, j);
        }
    }

    /* renamed from: b */
    public final brx mo30582b() {
        return this.f43664e;
    }

    /* renamed from: a */
    public final long mo30575a(bsi[] bsiArr, boolean[] zArr, brr[] brrArr, boolean[] zArr2, long j) {
        int i;
        bsi[] bsiArr2 = bsiArr;
        brr[] brrArr2 = brrArr;
        int[] iArr = new int[bsiArr2.length];
        int[] iArr2 = new int[bsiArr2.length];
        for (int i2 = 0; i2 < bsiArr2.length; i2++) {
            if (brrArr2[i2] == null) {
                i = -1;
            } else {
                i = ((Integer) this.f43661b.get(brrArr2[i2])).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (bsiArr2[i2] != null) {
                brv a = bsiArr2[i2].mo30643a();
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f43660a.length) {
                        break;
                    } else if (this.f43660a[i3].mo30582b().mo30639a(a) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f43661b.clear();
        brr[] brrArr3 = new brr[bsiArr2.length];
        brr[] brrArr4 = new brr[bsiArr2.length];
        bsi[] bsiArr3 = new bsi[bsiArr2.length];
        ArrayList arrayList = new ArrayList(this.f43660a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f43660a.length) {
            int i5 = 0;
            while (i5 < bsiArr2.length) {
                bsi bsi = null;
                brrArr4[i5] = iArr[i5] == i4 ? brrArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    bsi = bsiArr2[i5];
                }
                bsiArr3[i5] = bsi;
                i5++;
            }
            ArrayList arrayList2 = arrayList;
            bsi[] bsiArr4 = bsiArr3;
            int i6 = i4;
            long a2 = this.f43660a[i4].mo30575a(bsiArr3, zArr, brrArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = a2;
            } else if (a2 != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < bsiArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    bti.m36701b(brrArr4[i7] != null);
                    brrArr3[i7] = brrArr4[i7];
                    this.f43661b.put(brrArr4[i7], Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (brrArr4[i7] != null) {
                        z2 = false;
                    }
                    bti.m36701b(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f43660a[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            bsiArr3 = bsiArr4;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(brrArr3, 0, brrArr2, 0, brrArr3.length);
        this.f43665f = new bre[arrayList3.size()];
        arrayList3.toArray(this.f43665f);
        this.f43666g = new bqs(this.f43665f);
        return j2;
    }

    /* renamed from: a */
    public final boolean mo30572a(long j) {
        return this.f43666g.mo30572a(j);
    }

    /* renamed from: K_ */
    public final long mo30571K_() {
        return this.f43666g.mo30571K_();
    }

    /* renamed from: c */
    public final long mo30583c() {
        long c = this.f43660a[0].mo30583c();
        int i = 1;
        while (i < this.f43660a.length) {
            if (this.f43660a[i].mo30583c() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
        if (c != -9223372036854775807L) {
            bre[] breArr = this.f43665f;
            int length = breArr.length;
            int i2 = 0;
            while (i2 < length) {
                bre bre = breArr[i2];
                if (bre == this.f43660a[0] || bre.mo30581b(c) == c) {
                    i2++;
                } else {
                    throw new IllegalStateException("Children seeked to different positions");
                }
            }
        }
        return c;
    }

    /* renamed from: d */
    public final long mo30584d() {
        long j = Long.MAX_VALUE;
        for (bre d : this.f43665f) {
            long d2 = d.mo30584d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: b */
    public final long mo30581b(long j) {
        long b = this.f43665f[0].mo30581b(j);
        int i = 1;
        while (i < this.f43665f.length) {
            if (this.f43665f[i].mo30581b(b) == b) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo30385a(bre bre) {
        int i = this.f43663d - 1;
        this.f43663d = i;
        if (i <= 0) {
            int i2 = 0;
            for (bre b : this.f43660a) {
                i2 += b.mo30582b().f43741b;
            }
            brv[] brvArr = new brv[i2];
            bre[] breArr = this.f43660a;
            int length = breArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                brx b2 = breArr[i3].mo30582b();
                int i5 = b2.f43741b;
                int i6 = i4;
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = i6 + 1;
                    brvArr[i6] = b2.mo30640a(i7);
                    i7++;
                    i6 = i8;
                }
                i3++;
                i4 = i6;
            }
            this.f43664e = new brx(brvArr);
            this.f43662c.mo30385a(this);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo30386a(brs brs) {
        if (this.f43664e != null) {
            this.f43662c.mo30386a(this);
        }
    }
}
