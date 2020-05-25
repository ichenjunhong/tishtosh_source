package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.lc */
final class C16852lc {

    /* renamed from: a */
    final int f47305a;

    /* renamed from: b */
    final byte[] f47306b;

    C16852lc(int i, byte[] bArr) {
        this.f47305a = i;
        this.f47306b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16852lc)) {
            return false;
        }
        C16852lc lcVar = (C16852lc) obj;
        return this.f47305a == lcVar.f47305a && Arrays.equals(this.f47306b, lcVar.f47306b);
    }

    public final int hashCode() {
        return ((this.f47305a + 527) * 31) + Arrays.hashCode(this.f47306b);
    }
}
