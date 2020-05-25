package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.measurement.fc */
public abstract class C16675fc<T> {

    /* renamed from: a */
    public static final Object f46909a = new Object();

    /* renamed from: b */
    public static Context f46910b = null;

    /* renamed from: d */
    public static final AtomicInteger f46911d = new AtomicInteger();

    /* renamed from: e */
    private static boolean f46912e = false;

    /* renamed from: c */
    public final T f46913c;

    /* renamed from: f */
    private final C16681fi f46914f;

    /* renamed from: g */
    private final String f46915g;

    /* renamed from: h */
    private volatile int f46916h;

    /* renamed from: i */
    private volatile T f46917i;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo31983a(Object obj);

    /* renamed from: a */
    static void m39833a() {
        f46911d.incrementAndGet();
    }

    private C16675fc(C16681fi fiVar, String str, T t) {
        this.f46916h = -1;
        if (fiVar.f46920c != null) {
            this.f46914f = fiVar;
            this.f46915g = str;
            this.f46913c = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    private final String m39832a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f46915g;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f46915g);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: c */
    private String m39834c() {
        return m39832a(this.f46914f.f46919b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo31984b() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f46911d
            int r0 = r0.get()
            int r1 = r5.f46916h
            if (r1 >= r0) goto L_0x00b2
            monitor-enter(r5)
            int r1 = r5.f46916h     // Catch:{ all -> 0x00af }
            if (r1 >= r0) goto L_0x00ad
            android.content.Context r1 = f46910b     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00a5
            android.content.Context r1 = f46910b     // Catch:{ all -> 0x00af }
            com.google.android.gms.internal.measurement.ey r1 = com.google.android.gms.internal.measurement.C16670ey.m39826a(r1)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.mo31976a(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0031
            java.util.regex.Pattern r2 = com.google.android.gms.internal.measurement.C16660eo.f46879b     // Catch:{ all -> 0x00af }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00af }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r2 = 0
            if (r1 != 0) goto L_0x0065
            com.google.android.gms.internal.measurement.fi r1 = r5.f46914f     // Catch:{ all -> 0x00af }
            android.net.Uri r1 = r1.f46920c     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x004e
            android.content.Context r1 = f46910b     // Catch:{ all -> 0x00af }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00af }
            com.google.android.gms.internal.measurement.fi r3 = r5.f46914f     // Catch:{ all -> 0x00af }
            android.net.Uri r3 = r3.f46920c     // Catch:{ all -> 0x00af }
            com.google.android.gms.internal.measurement.er r1 = com.google.android.gms.internal.measurement.C16663er.m39812a(r1, r3)     // Catch:{ all -> 0x00af }
            goto L_0x0054
        L_0x004e:
            android.content.Context r1 = f46910b     // Catch:{ all -> 0x00af }
            com.google.android.gms.internal.measurement.fj r1 = com.google.android.gms.internal.measurement.C16682fj.m39846a(r1, r2)     // Catch:{ all -> 0x00af }
        L_0x0054:
            if (r1 == 0) goto L_0x007e
            java.lang.String r3 = r5.m39834c()     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = r1.mo31976a(r3)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r5.mo31983a(r1)     // Catch:{ all -> 0x00af }
            goto L_0x007f
        L_0x0065:
            java.lang.String r1 = "Bypass reading Phenotype values for flag: "
            java.lang.String r3 = r5.m39834c()     // Catch:{ all -> 0x00af }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00af }
            int r4 = r3.length()     // Catch:{ all -> 0x00af }
            if (r4 == 0) goto L_0x0079
            r1.concat(r3)     // Catch:{ all -> 0x00af }
            goto L_0x007e
        L_0x0079:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x00af }
            r3.<init>(r1)     // Catch:{ all -> 0x00af }
        L_0x007e:
            r1 = r2
        L_0x007f:
            if (r1 == 0) goto L_0x0082
            goto L_0x00a0
        L_0x0082:
            android.content.Context r1 = f46910b     // Catch:{ all -> 0x00af }
            com.google.android.gms.internal.measurement.ey r1 = com.google.android.gms.internal.measurement.C16670ey.m39826a(r1)     // Catch:{ all -> 0x00af }
            com.google.android.gms.internal.measurement.fi r3 = r5.f46914f     // Catch:{ all -> 0x00af }
            java.lang.String r3 = r3.f46918a     // Catch:{ all -> 0x00af }
            java.lang.String r3 = r5.m39832a(r3)     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = r1.mo31976a(r3)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x009a
            java.lang.Object r2 = r5.mo31983a(r1)     // Catch:{ all -> 0x00af }
        L_0x009a:
            r1 = r2
            if (r1 == 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            T r1 = r5.f46913c     // Catch:{ all -> 0x00af }
        L_0x00a0:
            r5.f46917i = r1     // Catch:{ all -> 0x00af }
            r5.f46916h = r0     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x00a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00ad:
            monitor-exit(r5)     // Catch:{ all -> 0x00af }
            goto L_0x00b2
        L_0x00af:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00af }
            throw r0
        L_0x00b2:
            T r0 = r5.f46917i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16675fc.mo31984b():java.lang.Object");
    }

    /* synthetic */ C16675fc(C16681fi fiVar, String str, Object obj, C16676fd fdVar) {
        this(fiVar, str, obj);
    }
}
