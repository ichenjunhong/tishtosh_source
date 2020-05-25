package com.bytedance.crash.p554m;

import android.content.Context;

/* renamed from: com.bytedance.crash.m.f */
public final class C9678f implements Runnable {

    /* renamed from: a */
    private Context f26391a;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.bytedance.crash.C9577e.m18999a().mo17384a("NPTH_CATCH", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00da, code lost:
        if (com.bytedance.crash.p551k.C9649f.m19247b().f26363d != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dc, code lost:
        com.bytedance.crash.p553l.C9666d.m19269a(com.bytedance.crash.p551k.C9649f.m19247b().f26363d, r6.f26391a).mo17516a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ed, code lost:
        com.bytedance.crash.p551k.C9652h.m19252a().mo17503a(com.bytedance.crash.C9616k.m19147a().mo17447b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0102, code lost:
        if (com.bytedance.crash.p551k.C9649f.m19247b().f26363d != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0104, code lost:
        com.bytedance.crash.p553l.C9666d.m19269a(com.bytedance.crash.p551k.C9649f.m19247b().f26363d, r6.f26391a).mo17516a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0113, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012a, code lost:
        if (com.bytedance.crash.p551k.C9649f.m19247b().f26363d == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ec A[ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f26391a     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            boolean r0 = com.bytedance.crash.p555n.C9685a.m19317b(r0)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            if (r0 == 0) goto L_0x00c2
            com.bytedance.crash.k.c r0 = com.bytedance.crash.p551k.C9638c.m19220a()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            android.content.Context r1 = r6.f26391a     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            boolean r1 = com.bytedance.crash.p555n.C9706n.m19412b(r1)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            if (r1 == 0) goto L_0x00c5
            com.bytedance.crash.k.c$b r1 = r0.f26303b     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            if (r1 != 0) goto L_0x005c
            com.bytedance.crash.k.c$b r1 = new com.bytedance.crash.k.c$b     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            java.lang.String r2 = "old_uuid"
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r0.f26303b = r1     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r1.<init>()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r0.f26304c = r1     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            java.util.HashMap<java.lang.String, com.bytedance.crash.k.c$b> r1 = r0.f26304c     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.k.c$b r2 = r0.f26303b     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r0.mo17484b(r1, r2)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            java.util.HashMap<java.lang.String, com.bytedance.crash.k.c$b> r1 = r0.f26304c     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.k.c$b r2 = r0.f26303b     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r0.mo17486c(r1, r2)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            java.util.HashMap<java.lang.String, com.bytedance.crash.k.c$b> r1 = r0.f26304c     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.k.c$b r2 = r0.f26303b     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r0.mo17481a(r1, r2)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.k.c$b r1 = r0.f26303b     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r2 = 1
            r0.mo17483b(r1, r2)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.k.c$b r1 = r0.f26303b     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r0.mo17480a(r1, r2)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r1 = 0
            r0.f26303b = r1     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            java.util.HashMap<java.lang.String, com.bytedance.crash.k.c$b> r1 = r0.f26304c     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            boolean r1 = r1.isEmpty()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            if (r1 == 0) goto L_0x0059
            r0.f26305d = r2     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.nativecrash.NativeImpl.m19475d()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            goto L_0x005c
        L_0x0059:
            r0.mo17487d()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
        L_0x005c:
            r0.mo17488e()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.p555n.C9694f.m19346d()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            android.content.Context r0 = r0.f26302a     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.b.e r0 = com.bytedance.crash.p540b.C9559e.m18967a(r0)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            com.bytedance.crash.b.a r0 = r0.f26061a     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            android.content.Context r2 = r0.f26036b     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            java.lang.String r4 = "has_anr_signal_"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            android.content.Context r0 = r0.f26036b     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            java.lang.String r0 = com.bytedance.crash.p555n.C9685a.m19318c(r0)     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            java.lang.String r4 = ":"
            java.lang.String r5 = "_"
            java.lang.String r0 = r0.replaceAll(r4, r5)     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            r3.append(r0)     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            java.lang.String r0 = r3.toString()     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            r1.<init>(r2, r0)     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            boolean r0 = r1.exists()     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            if (r0 == 0) goto L_0x00b3
            r1.delete()     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            com.bytedance.crash.f r0 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            java.lang.String r1 = "NPTH_DEAD_ANR"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            r2.<init>()     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            r0.mo17384a(r1, r2)     // Catch:{ Throwable -> 0x00a9, all -> 0x00ec }
            goto L_0x00b3
        L_0x00a9:
            r0 = move-exception
            com.bytedance.crash.f r1 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo17384a(r2, r0)     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
        L_0x00b3:
            boolean r0 = com.bytedance.crash.p547g.C9591c.f26168b     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            if (r0 == 0) goto L_0x00be
            java.lang.Runnable r0 = com.bytedance.crash.p547g.C9591c.m19088e()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            r0.run()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
        L_0x00be:
            com.bytedance.crash.p541c.C9569a.m18981a()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
            goto L_0x00c5
        L_0x00c2:
            com.bytedance.crash.nativecrash.NativeImpl.m19475d()     // Catch:{ Throwable -> 0x0114, all -> 0x00ec }
        L_0x00c5:
            com.bytedance.crash.k.h r0 = com.bytedance.crash.p551k.C9652h.m19252a()
            com.bytedance.crash.k.a r1 = com.bytedance.crash.C9616k.m19147a()
            java.util.Map r1 = r1.mo17447b()
            r0.mo17503a(r1)
            com.bytedance.crash.k.j r0 = com.bytedance.crash.p551k.C9649f.m19247b()
            android.os.Handler r0 = r0.f26363d
            if (r0 == 0) goto L_0x012d
        L_0x00dc:
            com.bytedance.crash.k.j r0 = com.bytedance.crash.p551k.C9649f.m19247b()
            android.os.Handler r0 = r0.f26363d
            android.content.Context r1 = r6.f26391a
            com.bytedance.crash.l.d r0 = com.bytedance.crash.p553l.C9666d.m19269a(r0, r1)
            r0.mo17516a()
            return
        L_0x00ec:
            r0 = move-exception
            com.bytedance.crash.k.h r1 = com.bytedance.crash.p551k.C9652h.m19252a()
            com.bytedance.crash.k.a r2 = com.bytedance.crash.C9616k.m19147a()
            java.util.Map r2 = r2.mo17447b()
            r1.mo17503a(r2)
            com.bytedance.crash.k.j r1 = com.bytedance.crash.p551k.C9649f.m19247b()
            android.os.Handler r1 = r1.f26363d
            if (r1 == 0) goto L_0x0113
            com.bytedance.crash.k.j r1 = com.bytedance.crash.p551k.C9649f.m19247b()
            android.os.Handler r1 = r1.f26363d
            android.content.Context r2 = r6.f26391a
            com.bytedance.crash.l.d r1 = com.bytedance.crash.p553l.C9666d.m19269a(r1, r2)
            r1.mo17516a()
        L_0x0113:
            throw r0
        L_0x0114:
            com.bytedance.crash.k.h r0 = com.bytedance.crash.p551k.C9652h.m19252a()
            com.bytedance.crash.k.a r1 = com.bytedance.crash.C9616k.m19147a()
            java.util.Map r1 = r1.mo17447b()
            r0.mo17503a(r1)
            com.bytedance.crash.k.j r0 = com.bytedance.crash.p551k.C9649f.m19247b()
            android.os.Handler r0 = r0.f26363d
            if (r0 == 0) goto L_0x012d
            goto L_0x00dc
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p554m.C9678f.run():void");
    }

    public C9678f(Context context) {
        this.f26391a = context;
    }
}
