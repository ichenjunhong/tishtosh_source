package com.google.android.gms.internal.ads;

public final class bbv implements Cloneable {

    /* renamed from: b */
    private static final bbw f41785b = new bbw();

    /* renamed from: a */
    public int f41786a;

    /* renamed from: c */
    private int[] f41787c;

    /* renamed from: d */
    private bbw[] f41788d;

    bbv() {
        this(10);
    }

    private bbv(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f41787c = new int[i5];
        this.f41788d = new bbw[i5];
        this.f41786a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final bbw mo30031a(int i) {
        return this.f41788d[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbv)) {
            return false;
        }
        bbv bbv = (bbv) obj;
        if (this.f41786a != bbv.f41786a) {
            return false;
        }
        int[] iArr = this.f41787c;
        int[] iArr2 = bbv.f41787c;
        int i = this.f41786a;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            bbw[] bbwArr = this.f41788d;
            bbw[] bbwArr2 = bbv.f41788d;
            int i3 = this.f41786a;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!bbwArr[i4].equals(bbwArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f41786a; i2++) {
            i = (((i * 31) + this.f41787c[i2]) * 31) + this.f41788d[i2].hashCode();
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f41786a;
        bbv bbv = new bbv(i);
        System.arraycopy(this.f41787c, 0, bbv.f41787c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f41788d[i2] != null) {
                bbv.f41788d[i2] = (bbw) this.f41788d[i2].clone();
            }
        }
        bbv.f41786a = i;
        return bbv;
    }
}
