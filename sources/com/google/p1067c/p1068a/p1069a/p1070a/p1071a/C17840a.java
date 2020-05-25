package com.google.p1067c.p1068a.p1069a.p1070a.p1071a;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: com.google.c.a.a.a.a.a */
public final class C17840a {

    /* renamed from: a */
    static final C17841a f49603a;

    /* renamed from: b */
    static final int f49604b;

    /* renamed from: com.google.c.a.a.a.a.a$a */
    static abstract class C17841a {

        /* renamed from: a */
        protected static final Throwable[] f49605a = new Throwable[0];

        C17841a() {
        }

        /* renamed from: a */
        public abstract void mo34661a(Throwable th, PrintStream printStream);

        /* renamed from: a */
        public abstract void mo34662a(Throwable th, PrintWriter printWriter);

        /* renamed from: a */
        public abstract void mo34663a(Throwable th, Throwable th2);

        /* renamed from: a */
        public abstract Throwable[] mo34664a(Throwable th);

        /* renamed from: b */
        public abstract void mo34665b(Throwable th);
    }

    /* renamed from: com.google.c.a.a.a.a.a$b */
    static final class C17842b extends C17841a {
        C17842b() {
        }

        /* renamed from: a */
        public final void mo34663a(Throwable th, Throwable th2) {
        }

        /* renamed from: b */
        public final void mo34665b(Throwable th) {
            th.printStackTrace();
        }

        /* renamed from: a */
        public final Throwable[] mo34664a(Throwable th) {
            return f49605a;
        }

        /* renamed from: a */
        public final void mo34661a(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }

        /* renamed from: a */
        public final void mo34662a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    /* renamed from: com.google.c.a.a.a.a.a$c */
    static final class C17843c extends C17841a {
        C17843c() {
        }

        /* renamed from: b */
        public final void mo34665b(Throwable th) {
            th.printStackTrace();
        }

        /* renamed from: a */
        public final Throwable[] mo34664a(Throwable th) {
            return th.getSuppressed();
        }

        /* renamed from: a */
        public final void mo34661a(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }

        /* renamed from: a */
        public final void mo34662a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }

        /* renamed from: a */
        public final void mo34663a(Throwable th, Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: a */
    private static Integer m43749a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m43749a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0017
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x0015 }
            r3 = 19
            if (r2 < r3) goto L_0x0017
            com.google.c.a.a.a.a.a$c r2 = new com.google.c.a.a.a.a.a$c     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0056
        L_0x0015:
            r2 = move-exception
            goto L_0x002e
        L_0x0017:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ Throwable -> 0x0015 }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0026
            com.google.c.a.a.a.a.a$b r2 = new com.google.c.a.a.a.a.a$b     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0056
        L_0x0026:
            com.google.c.a.a.a.a.a$b r2 = new com.google.c.a.a.a.a.a$b     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0056
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r4.<init>(r5)
            java.lang.Class<com.google.c.a.a.a.a.a$b> r5 = com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.C17842b.class
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            java.lang.String r5 = "will be used. The error is: "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.c.a.a.a.a.a$b r2 = new com.google.c.a.a.a.a.a$b
            r2.<init>()
        L_0x0056:
            f49603a = r2
            if (r1 != 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            int r0 = r1.intValue()
        L_0x005f:
            f49604b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.<clinit>():void");
    }

    /* renamed from: b */
    public static void m43754b(Throwable th) {
        f49603a.mo34665b(th);
    }

    /* renamed from: a */
    public static Throwable[] m43753a(Throwable th) {
        return f49603a.mo34664a(th);
    }

    /* renamed from: a */
    public static void m43750a(Throwable th, PrintStream printStream) {
        f49603a.mo34661a(th, printStream);
    }

    /* renamed from: a */
    public static void m43751a(Throwable th, PrintWriter printWriter) {
        f49603a.mo34662a(th, printWriter);
    }

    /* renamed from: a */
    public static void m43752a(Throwable th, Throwable th2) {
        f49603a.mo34663a(th, th2);
    }
}
