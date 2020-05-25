package com.google.p1057b.p1058a;

import com.C2240a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.b.a.o */
public final class C17429o {

    /* renamed from: a */
    public boolean f48964a;

    /* renamed from: b */
    private final C17438t f48965b;

    /* renamed from: c */
    private long f48966c;

    /* renamed from: d */
    private long f48967d;

    /* renamed from: com.google.b.a.o$1 */
    static /* synthetic */ class C174301 {

        /* renamed from: a */
        static final /* synthetic */ int[] f48968a = new int[TimeUnit.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48968a = r0
                int[] r0 = f48968a     // Catch:{ NoSuchFieldError -> 0x0014 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f48968a     // Catch:{ NoSuchFieldError -> 0x001f }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f48968a     // Catch:{ NoSuchFieldError -> 0x002a }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f48968a     // Catch:{ NoSuchFieldError -> 0x0035 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f48968a     // Catch:{ NoSuchFieldError -> 0x0040 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f48968a     // Catch:{ NoSuchFieldError -> 0x004b }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f48968a     // Catch:{ NoSuchFieldError -> 0x0056 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1058a.C17429o.C174301.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C17429o m42673a() {
        return new C17429o();
    }

    /* renamed from: e */
    public final C17429o mo33757e() {
        this.f48966c = 0;
        this.f48964a = false;
        return this;
    }

    C17429o() {
        this.f48965b = C17438t.m42690b();
    }

    /* renamed from: b */
    public static C17429o m42675b() {
        return new C17429o().mo33755c();
    }

    /* renamed from: f */
    private long m42677f() {
        if (this.f48964a) {
            return (this.f48965b.mo33765a() - this.f48967d) + this.f48966c;
        }
        return this.f48966c;
    }

    /* renamed from: c */
    public final C17429o mo33755c() {
        C17421k.m42668b(!this.f48964a, (Object) "This stopwatch is already running.");
        this.f48964a = true;
        this.f48967d = this.f48965b.mo33765a();
        return this;
    }

    /* renamed from: d */
    public final C17429o mo33756d() {
        long a = this.f48965b.mo33765a();
        C17421k.m42668b(this.f48964a, (Object) "This stopwatch is already stopped.");
        this.f48964a = false;
        this.f48966c += a - this.f48967d;
        return this;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long f = m42677f();
        if (TimeUnit.DAYS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        double d = (double) f;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, timeUnit);
        Double.isNaN(d);
        Double.isNaN(convert);
        double d2 = d / convert;
        StringBuilder sb = new StringBuilder();
        sb.append(C2240a.m6773a(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d2)}));
        sb.append(" ");
        switch (C174301.f48968a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static C17429o m42674a(C17438t tVar) {
        return new C17429o(tVar);
    }

    private C17429o(C17438t tVar) {
        this.f48965b = (C17438t) C17421k.m42654a(tVar, (Object) "ticker");
    }

    /* renamed from: b */
    public static C17429o m42676b(C17438t tVar) {
        return new C17429o(tVar).mo33755c();
    }

    /* renamed from: a */
    public final long mo33754a(TimeUnit timeUnit) {
        return timeUnit.convert(m42677f(), TimeUnit.NANOSECONDS);
    }
}
