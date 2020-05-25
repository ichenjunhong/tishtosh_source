package com.google.android.gms.internal.p1044e;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;

/* renamed from: com.google.android.gms.internal.e.b */
public final class C16484b {

    /* renamed from: a */
    private static final C16486c f46383a;

    /* renamed from: b */
    private static final int f46384b;

    /* renamed from: com.google.android.gms.internal.e.b$a */
    static final class C16485a extends C16486c {
        C16485a() {
        }

        /* renamed from: a */
        public final void mo31694a(Throwable th, Throwable th2) {
        }
    }

    /* renamed from: a */
    public static void m39352a(Throwable th, Throwable th2) {
        f46383a.mo31694a(th, th2);
    }

    /* renamed from: a */
    private static Integer m39351a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            C17840a.m43750a((Throwable) e, System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m39351a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0017
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x0015 }
            r3 = 19
            if (r2 < r3) goto L_0x0017
            com.google.android.gms.internal.e.g r2 = new com.google.android.gms.internal.e.g     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x0015:
            r2 = move-exception
            goto L_0x002e
        L_0x0017:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ Throwable -> 0x0015 }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0026
            com.google.android.gms.internal.e.f r2 = new com.google.android.gms.internal.e.f     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x0026:
            com.google.android.gms.internal.e.b$a r2 = new com.google.android.gms.internal.e.b$a     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.e.b$a> r4 = com.google.android.gms.internal.p1044e.C16484b.C16485a.class
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 132
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43750a(r2, r3)
            com.google.android.gms.internal.e.b$a r2 = new com.google.android.gms.internal.e.b$a
            r2.<init>()
        L_0x0063:
            f46383a = r2
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r0 = r1.intValue()
        L_0x006c:
            f46384b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p1044e.C16484b.<clinit>():void");
    }
}
