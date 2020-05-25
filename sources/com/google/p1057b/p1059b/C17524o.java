package com.google.p1057b.p1059b;

import java.util.Random;
import sun.misc.Unsafe;

/* renamed from: com.google.b.b.o */
abstract class C17524o extends Number {

    /* renamed from: a */
    static final ThreadLocal<int[]> f49164a = new ThreadLocal<>();

    /* renamed from: b */
    static final Random f49165b = new Random();

    /* renamed from: c */
    static final int f49166c = Runtime.getRuntime().availableProcessors();

    /* renamed from: g */
    private static final Unsafe f49167g;

    /* renamed from: h */
    private static final long f49168h;

    /* renamed from: i */
    private static final long f49169i;

    /* renamed from: d */
    volatile transient C17526a[] f49170d;

    /* renamed from: e */
    volatile transient long f49171e;

    /* renamed from: f */
    volatile transient int f49172f;

    /* renamed from: com.google.b.b.o$a */
    static final class C17526a {

        /* renamed from: b */
        private static final Unsafe f49173b;

        /* renamed from: c */
        private static final long f49174c;

        /* renamed from: a */
        volatile long f49175a;

        static {
            try {
                f49173b = C17524o.m43047c();
                f49174c = f49173b.objectFieldOffset(C17526a.class.getDeclaredField("value"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        C17526a(long j) {
            this.f49175a = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33941a(long j, long j2) {
            return f49173b.compareAndSwapLong(this, f49174c, j, j2);
        }
    }

    C17524o() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract long mo33929a(long j, long j2);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo33938b() {
        return f49167g.compareAndSwapInt(this, f49169i, 0, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.p1057b.p1059b.C17524o.C175251());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe m43047c() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.b.b.o$1 r0 = new com.google.b.b.o$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1059b.C17524o.m43047c():sun.misc.Unsafe");
    }

    static {
        try {
            f49167g = m43047c();
            Class<C17524o> cls = C17524o.class;
            f49168h = f49167g.objectFieldOffset(cls.getDeclaredField("base"));
            f49169i = f49167g.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo33939b(long j, long j2) {
        return f49167g.compareAndSwapLong(this, f49168h, j, j2);
    }
}
