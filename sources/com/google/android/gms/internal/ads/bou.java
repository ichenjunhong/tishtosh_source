package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bou {

    /* renamed from: a */
    public final int f43204a = 1;

    /* renamed from: b */
    public final byte[] f43205b;

    public bou(int i, byte[] bArr) {
        this.f43205b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bou bou = (bou) obj;
        return this.f43204a == bou.f43204a && Arrays.equals(this.f43205b, bou.f43205b);
    }

    public final int hashCode() {
        return (this.f43204a * 31) + Arrays.hashCode(this.f43205b);
    }
}
