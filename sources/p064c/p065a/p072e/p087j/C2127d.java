package p064c.p065a.p072e.p087j;

import java.util.concurrent.atomic.AtomicLong;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.j.d */
public final class C2127d {
    /* renamed from: a */
    public static long m6414a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: a */
    public static long m6415a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m6414a(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m6416b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder("More produced than requested: ");
                sb.append(j3);
                C2150a.m6492a((Throwable) new IllegalStateException(sb.toString()));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    /* renamed from: c */
    public static long m6417c(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - 1;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder("More produced than requested: ");
                sb.append(j3);
                C2150a.m6492a((Throwable) new IllegalStateException(sb.toString()));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
