package com.google.android.gms.internal.ads;

public final class bqs implements brs {

    /* renamed from: a */
    private final brs[] f43593a;

    public bqs(brs[] brsArr) {
        this.f43593a = brsArr;
    }

    /* renamed from: K_ */
    public final long mo30571K_() {
        long j = Long.MAX_VALUE;
        for (brs K_ : this.f43593a) {
            long K_2 = K_.mo30571K_();
            if (K_2 != Long.MIN_VALUE) {
                j = Math.min(j, K_2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: a */
    public final boolean mo30572a(long j) {
        brs[] brsArr;
        boolean z;
        boolean z2 = false;
        do {
            long K_ = mo30571K_();
            if (K_ == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (brs brs : this.f43593a) {
                if (brs.mo30571K_() == K_) {
                    z |= brs.mo30572a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
