package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.l */
final class C4033l {
    /* renamed from: a */
    static long m10161a(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            j3 = Long.MAX_VALUE;
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            long j4 = j2 + j;
            if (j4 >= 0) {
                j3 = j4;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j2;
    }
}
