package com.google.android.play.core.p1051c;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;

/* renamed from: com.google.android.play.core.c.ak */
public final class C17261ak {

    /* renamed from: a */
    private static final C17260aj f48730a;

    /* renamed from: b */
    private static final int f48731b;

    /* renamed from: com.google.android.play.core.c.ak$a */
    static final class C17262a extends C17260aj {
        C17262a() {
        }

        /* renamed from: a */
        public final void mo33545a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m42288a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0017
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x0015 }
            r3 = 19
            if (r2 < r3) goto L_0x0017
            com.google.android.play.core.c.ao r2 = new com.google.android.play.core.c.ao     // Catch:{ Throwable -> 0x0015 }
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
            com.google.android.play.core.c.an r2 = new com.google.android.play.core.c.an     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x0026:
            com.google.android.play.core.c.ak$a r2 = new com.google.android.play.core.c.ak$a     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0063
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.play.core.c.ak$a> r4 = com.google.android.play.core.p1051c.C17261ak.C17262a.class
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43750a(r2, r3)
            com.google.android.play.core.c.ak$a r2 = new com.google.android.play.core.c.ak$a
            r2.<init>()
        L_0x0063:
            f48730a = r2
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r0 = r1.intValue()
        L_0x006c:
            f48731b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1051c.C17261ak.<clinit>():void");
    }

    /* renamed from: a */
    private static Integer m42288a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            C17840a.m43750a((Throwable) e, System.err);
            return null;
        }
    }

    /* renamed from: a */
    public static void m42289a(Throwable th, Throwable th2) {
        f48730a.mo33545a(th, th2);
    }
}
