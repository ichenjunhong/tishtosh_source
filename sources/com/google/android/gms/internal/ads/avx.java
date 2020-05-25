package com.google.android.gms.internal.ads;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;

public final class avx {

    /* renamed from: a */
    static final avy f41447a;

    /* renamed from: b */
    private static final int f41448b;

    /* renamed from: com.google.android.gms.internal.ads.avx$a */
    static final class C15662a extends avy {
        C15662a() {
        }

        /* renamed from: a */
        public final void mo29572a(Throwable th) {
        }

        /* renamed from: a */
        public final void mo29573a(Throwable th, PrintWriter printWriter) {
            C17840a.m43751a(th, printWriter);
        }
    }

    /* renamed from: a */
    public static void m34243a(Throwable th, PrintWriter printWriter) {
        f41447a.mo29573a(th, printWriter);
    }

    /* renamed from: a */
    private static Integer m34242a() {
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
            java.lang.Integer r1 = m34242a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0017
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x0015 }
            r3 = 19
            if (r2 < r3) goto L_0x0017
            com.google.android.gms.internal.ads.awc r2 = new com.google.android.gms.internal.ads.awc     // Catch:{ Throwable -> 0x0015 }
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
            com.google.android.gms.internal.ads.awb r2 = new com.google.android.gms.internal.ads.awb     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x0026:
            com.google.android.gms.internal.ads.avx$a r2 = new com.google.android.gms.internal.ads.avx$a     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.ads.avx$a> r4 = com.google.android.gms.internal.ads.avx.C15662a.class
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
            com.google.android.gms.internal.ads.avx$a r2 = new com.google.android.gms.internal.ads.avx$a
            r2.<init>()
        L_0x0063:
            f41447a = r2
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r0 = r1.intValue()
        L_0x006c:
            f41448b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.avx.<clinit>():void");
    }
}
